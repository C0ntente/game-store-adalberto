package com.adalberto.gamestore.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {

	@Id
	@GeneratedValue
	private Long id;
	private String address;
	private Integer number;
	private String complement;
	private String city;

}
