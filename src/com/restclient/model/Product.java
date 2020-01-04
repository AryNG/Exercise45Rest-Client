package com.restclient.model;
/*If we sent the information as parameters we need to receive them as parameters as well, that's why we create a new model for out client*/
public class Product {

	private int idProduct;
	private String nombreProduct;
	private double precioProduct;
	
	public Product() {}
	public Product(int idProduct, String nombreProduct, double precioProdcut) {
		this.idProduct = idProduct;
		this.nombreProduct =  nombreProduct;
		this.precioProduct = precioProduct;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getNombreProduct() {
		return nombreProduct;
	}
	public void setNombreProduct(String nombreProduct) {
		this.nombreProduct = nombreProduct;
	}
	public double getPrecioProduct() {
		return precioProduct;
	}
	public void setPrecioProduct(double precioProduct) {
		this.precioProduct = precioProduct;
	}
	public String toString() {
		return "IdProducto: " + this.idProduct + ", Product Name: "+this.nombreProduct +", Product Price: "+this.precioProduct;
	}
}

