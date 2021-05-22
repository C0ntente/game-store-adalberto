package com.adalberto.gamestore.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Checkout {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String cpf;
	private String cardNumber;
	@OneToOne
	private Address address;
}
