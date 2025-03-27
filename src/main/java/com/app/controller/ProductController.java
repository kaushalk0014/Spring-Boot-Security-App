package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entiry.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/app/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/home")
	public ResponseEntity<String> homePage(){
		String result="Welcome To home Page";
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
	@PreAuthorize("hasAuthority('ROLL_ADMIN')")
	@GetMapping("/getAallPrduct")
	public ResponseEntity<List<Product>> getAallPrduct(){
		List<Product> list=productService.getAallPrduct();
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@GetMapping("/getById")
	@PreAuthorize("hasAuthority('ROLL_USER')")
	public ResponseEntity<Product> getById(Integer id){
		Product product=productService.getById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
}
