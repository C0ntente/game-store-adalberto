package com.adalberto.gamestore.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.adalberto.gamestore.domain.model.Product;
import com.adalberto.gamestore.domain.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> list(String orderBy) {
		switch (orderBy) {
		case "name_asc":
			return productRepository.findAll(Sort.by(Direction.ASC, "name"));
		case "name_desc":
			return productRepository.findAll(Sort.by(Direction.DESC, "name"));
		case "price_asc":
			return productRepository.findAll(Sort.by(Direction.ASC, "price"));
		case "price_desc":
			return productRepository.findAll(Sort.by(Direction.DESC, "price"));
		case "score_asc":
			return productRepository.findAll(Sort.by(Direction.ASC, "score"));
		case "score_desc":
			return productRepository.findAll(Sort.by(Direction.DESC, "score"));

		default:
			return productRepository.findAll();
		}

	}
}
