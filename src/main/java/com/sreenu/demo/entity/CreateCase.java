package com.sreenu.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Create_Case")
public class CreateCase {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer appId;

}
