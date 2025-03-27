package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.ProductDAO;
import com.app.entiry.Product;

@Service
public class ProductServiceImpl implements ProductService {
   
	@Autowired
	private ProductDAO productDAO;
    
	@Override
    public List<Product> getAallPrduct() {
        return productDAO.findAll();
    }

    @Override
    public Product getById(Integer id) {
    	return productDAO.findById(id).get();
    }
}
