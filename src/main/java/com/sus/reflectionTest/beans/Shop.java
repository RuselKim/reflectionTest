package com.sus.reflectionTest.beans;

import com.sus.reflectionTest.Pritable;

public class Shop extends AEntity {

	public Shop(String name, String adress) {
		this.adress = adress;
		this.name = name;

	}

	public Shop(int id, String name, String adress) {
		this.id = id;
		this.adress = adress;
		this.name = name;

	}

	private int id;
	@Pritable
	private String name;
	private String adress;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		System.out.println("printMe from Shop");
	}

}
