package com.hello;

import java.util.List;
import java.util.Iterator;
import java.util.ServiceLoader;

import com.dep.Animal;
import com.service.output.api.OutputService;

import com.google.common.collect.Lists;

public class Main {

	public static void main(String[] args) {

		OutputService out = getOutputServiceFromServiceLoader();
		
		sayHello(out);

		printThisModule();

		createAnimalAndSpeak();

		initListWithGuava();
	}

	private static void sayHello(OutputService out) {
		out.printOut("Part 1: Say Hello");

		out.printOut("Hello");

		out.printOut("-----------------------");
	}

	private static void printThisModule() {
		System.out.println("Part 2: Print module name for this class");

		System.out.println(Main.class.getModule());

		System.out.println("-----------------------");
	}

	private static void createAnimalAndSpeak() {
		System.out.println("Part 3: use Animal class from dep module");
		System.out.println(Animal.class.getModule());
		
		Animal anAnimal = new Animal();
		anAnimal.speak();

		System.out.println("-----------------------");
	}

	private static void initListWithGuava() {
		System.out.println("Part 4: Use guava automatic module to create list and print it");

		List<String> names = Lists.newArrayList("Lewis", "Ashley", "Maggie", "Brodie");
		System.out.println();
		System.out.println(names);

		System.out.println("-----------------------");
	}

	private static OutputService getOutputServiceFromServiceLoader() {
		System.out.println("Using serviceloader for decoupled dependencies");

		ServiceLoader<OutputService> sl = ServiceLoader.load(OutputService.class);
		Iterator<OutputService> iter = sl.iterator();
		OutputService service = iter.next();

		service.printOut("Implicit output service found");
		System.out.println("-----------------------");

		return service;
	}

}
