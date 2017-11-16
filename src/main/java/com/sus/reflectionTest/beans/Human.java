package com.sus.reflectionTest.beans;

import com.sus.reflectionTest.Pritable;

public class Human extends AEntity {

	public Human(String name, Integer age) {
		this.age = age;
		this.name = name;
	}

	public Human(Integer id, String name, Integer age) {
		this.age = age;
		this.id = id;
		this.name = name;
	}

	private Integer id;
	@Pritable
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	private void printMe() {
		System.out.println("printMe from Human");
	}

}
