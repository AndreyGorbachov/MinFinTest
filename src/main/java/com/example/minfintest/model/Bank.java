package com.example.minfintest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class Bank {

	/**
	 * Тип Банк/Филиал
	 */
	@JsonProperty("typ")
	String typ;

	/**
	 * БИК
	 */
	@JsonProperty("CDBank")
	String cdBank;

	/**
	 * БИК головного банка
	 */
	@JsonProperty("CDHeadBank")
	String cdHeadBank;

	/**
	 * Условный номер участника расчетов
	 */
	@JsonProperty("NrBank")
	String nrBank;

	/**
	 * Статус БИК
	 */
	@JsonProperty("BICStatus")
	String bicStatus;

	/**
	 * Наименование банка/филиала
	 */
	@JsonProperty("NmBankShort")
	String nmBankShort;

	/**
	 * Населенный пункт
	 */
	@JsonProperty("AdrBank")
	String adrBank;

	/**
	 * Код контроля (null - действует, ЗАКР, ЛИКВ)
	 */
	@JsonProperty("CdControl")
	String cdControl;

	/**
	 * Дата контроля (может принимать значение null)
	 */
	@JsonProperty("DtControl")
	Date dtControl;

	/**
	 * БИК приемника (может принимать значение null
	 */
	@JsonProperty("CdBankSuccessor")
	String cdBankSuccessor;

	/**
	 * Дата начала действия записи
	 */
	@JsonProperty("DTBegin")
	Date dtBegin;

	/**
	 * Дата окончания действия записи
	 */
	@JsonProperty("DtEnd")
	Date dtEnd;

}
