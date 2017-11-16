package com.sus.reflectionTest1.runer;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import com.sus.reflectionTest1.Pritable;
import com.sus.reflectionTest1.beans.AEntity;
import com.sus.reflectionTest1.beans.Car;
import com.sus.reflectionTest1.beans.Human;
import com.sus.reflectionTest1.beans.Shop;



public class Main {
	public static void main(String[] args) throws Exception {
		ArrayList<AEntity> list = new ArrayList<AEntity>();
		Car car = new Car(1, "Q6", 12000, null);
		Shop shop = new Shop(1, "avtomir", "BLK street");
		Human human = new Human(1, "John", 20);
		list.add(car);
		list.add(shop);
		list.add(human);

		System.out.println("Zadanije 1");
		for (AEntity a : list) {
			System.out.println(getClassName(a));
		}

		System.out.println("Zadanije 2");
		System.out.println("name before renaming: " + human.getName());
		Field f = human.getClass().getDeclaredField("name");
		f.setAccessible(true);
		f.set(human, "Rudolph");
		System.out.println("name before renaming: " + human.getName());

		System.out.println("Zadanije 3");
		for (AEntity a : list) {
			Class<? extends AEntity> aClass = a.getClass();
			Method aMethod = aClass.getDeclaredMethod("printMe");
			aMethod.setAccessible(true);
			aMethod.invoke(a);
		}

		System.out.println("Zadanije 4");

		for (AEntity a : list) {
			Field[] fList = a.getClass().getDeclaredFields();
			for (Field field : fList) {
				if (field.getDeclaredAnnotation(Pritable.class) instanceof Pritable) {
					System.out.println(field.getName());
				}

			}
		}

	}

	public static String getClassName(AEntity entity) {
		Class<? extends AEntity> c = entity.getClass();
		return c.getName();
	}

}
