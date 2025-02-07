package com.nt.inventory;
public class Product
{
  private int productId;
  private String productName;
   private double price;
   private int quantity;
public Product(int productId, String productName, double price, int quantity) 
{
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}
public int getProductId() {
	return productId;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@Override
public String toString() {
	return "product id= " + productId + ", productName=" + productName + ", price=" + price + ", quantity="
			+ quantity ;
}
  
}
