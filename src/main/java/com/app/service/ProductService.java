package com.app.service;

import java.util.List;

import com.app.dto.ProductDTO;

public interface ProductService {

	List<ProductDTO> getAallPrduct();

	ProductDTO getById(Integer id);


}
