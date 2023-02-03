package com.sreenu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Income_Details")
public class IncomeDetailsEntity {

	private Integer caseNumber;
	private Integer monthlySalaryIncome;
	private Integer rentIncome;
	private Integer propertyIncome;
	
}
