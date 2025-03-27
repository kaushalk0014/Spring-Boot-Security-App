package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entiry.Product;

@Repository
public interface ProductDAO extends  JpaRepository<Product, Integer>{

}
