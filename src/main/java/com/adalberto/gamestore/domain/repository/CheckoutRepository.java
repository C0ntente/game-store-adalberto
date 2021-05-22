package com.adalberto.gamestore.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adalberto.gamestore.domain.model.Checkout;

@Repository
public interface CheckoutRepository extends CrudRepository<Checkout, Long> {

}
