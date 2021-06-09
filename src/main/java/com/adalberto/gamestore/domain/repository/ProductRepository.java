package com.adalberto.gamestore.domain.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adalberto.gamestore.domain.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	List<Product> findAll();
	List<Product> findAll(Sort sort);

}
