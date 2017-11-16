package com.sus.reflectionTest1.beans;

import com.sus.reflectionTest1.Pritable;

public class Car extends AEntity {

	public Car(String model, int price, Shop shops) {

		this.model = model;
		this.price = price;
		this.shop = shops;
	}

	public Car(int id, String model, int price, Shop shops) {
		this.id = id;
		this.model = model;
		this.price = price;
		this.shop = shops;
	}

	private Integer id;

	@Pritable
	private String model;

	private Integer price;

	private Shop shop;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	private void printMe() {
		System.out.println("printMe from Car");
	}

}
