package org.antwalk.model;

public class Phone 
{
	private int id,price;
	private String brand;
	public Phone() {
		super();
	}
	public Phone(int id, int price, String brand) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
