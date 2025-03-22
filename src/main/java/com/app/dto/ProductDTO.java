package com.app.dto;


public class ProductDTO {

	private Integer id;
	private String productName;
	private String desecription;
	private Integer qty;
	private Double price;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDesecription() {
		return desecription;
	}

	public void setDesecription(String desecription) {
		this.desecription = desecription;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [desecription=" + desecription + ", id=" + id + ", price=" + price + ", productName="
				+ productName + ", qty=" + qty + "]";
	}
}

