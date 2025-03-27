package com.app.service;

import java.util.List;

import com.app.entiry.Product;

public interface ProductService {

	List<Product> getAallPrduct();

	Product getById(Integer id);


}
