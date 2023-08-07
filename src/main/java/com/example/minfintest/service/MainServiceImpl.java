package com.example.minfintest.service;

import com.example.minfintest.model.Bank;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MainServiceImpl implements MainService {

	private static final String BANKS_URL = "https://api.nbrb.by/bic";

	private final RestTemplate restTemplate;

	public MainServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<Bank> getBanks() {
		ResponseEntity<List<Bank>> response = restTemplate.exchange(BANKS_URL,
				HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
		return response.getBody();
	}

}
