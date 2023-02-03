package com.sreenu.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Education_Details")
public class EducationDetailsEntity {

	private Integer caseNumber;
	private String highestDegree;
	private Date graduationYear;
	private String universtiyName;
}
