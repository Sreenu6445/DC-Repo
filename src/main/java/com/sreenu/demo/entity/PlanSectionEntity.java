package com.sreenu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Plan_Section")
public class PlanSectionEntity {

	private Integer caseNumber;
	private String planName;
}
