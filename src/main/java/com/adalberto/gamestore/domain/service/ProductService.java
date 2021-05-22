package com.adalberto.gamestore.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adalberto.gamestore.domain.model.Product;
import com.adalberto.gamestore.domain.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> list(){
		return productRepository.findAll();

	}
}
