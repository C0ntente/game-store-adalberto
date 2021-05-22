package com.adalberto.gamestore.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

   @Id
   @GeneratedValue
   public Long id;

   public String name;

   public BigDecimal price;

   public Short score;

   public String image;

}