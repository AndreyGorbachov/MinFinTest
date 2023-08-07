package com.example.minfintest.controller;

import com.example.minfintest.model.Bank;
import com.example.minfintest.service.MainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Slf4j
@Controller
public class MainController {

	private final MainService mainService;

	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

	@ModelAttribute
	public void addAttributes(Model model) {
		List<Bank> banks = mainService.getBanks();
		log.debug(banks.toString());
		model.addAttribute("banks", banks);
	}

	@GetMapping("/")
	public String main() {
		return "main";
	}

}
