package com.sreenu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Kid_Details")
public class KidDetailsEntity {

	private Integer caseNumber;
	private String kidName;
	private Integer kidAge;
	private Integer kidSSN;
	
}
