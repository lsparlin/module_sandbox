package com.hello;

import com.dep.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");

		System.out.println();

		System.out.println(Main.class.getModule());

		System.out.println();

		Animal anAnimal = new Animal();
		anAnimal.speak();

	}

}
