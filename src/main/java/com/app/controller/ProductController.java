package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
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
	
	@GetMapping("/getAallPrduct")
	public ResponseEntity<List<ProductDTO>> getAallPrduct(){
		List<ProductDTO> list=productService.getAallPrduct();
		return new ResponseEntity<List<ProductDTO>>(list, HttpStatus.OK);
	}

	@GetMapping("/getById")
	public ResponseEntity<ProductDTO> getById(Integer id){
		ProductDTO product=productService.getById(id);
		return new ResponseEntity<ProductDTO>(product, HttpStatus.OK);
	}
}
