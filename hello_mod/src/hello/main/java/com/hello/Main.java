package com.hello;

import java.util.List;
import java.util.Iterator;
import java.util.ServiceLoader;

import com.dep.Animal;
import com.service.output.api.OutputService;

//import com.google.common.collect.Lists;

public class Main {

	public static void main(String[] args) {

		OutputService out = getOutputServiceFromServiceLoader();
		
		sayHello(out);

		printThisModule(out);

		createAnimalAndSpeak(out);

		initListWithGuava(out);

	}

	private static void sayHello(OutputService out) {
		out.printOut("Part 1: Say Hello");

		out.printOut("Hello");

		out.printOut("-----------------------");
	}

	private static void printThisModule(OutputService out) {
		out.printOut("Part 2: Print module name for this class");

		out.printOut(Main.class.getModule());

		out.printOut("-----------------------");
	}

	private static void createAnimalAndSpeak(OutputService out) {
		out.printOut("Part 3: use Animal class from dep module");
		out.printOut(Animal.class.getModule());
		
		Animal anAnimal = new Animal();
		anAnimal.speak();

		out.printOut("-----------------------");
	}

	private static void initListWithGuava(OutputService out) {
		out.printOut("Part 4: Use guava automatic module to create list and print it");

		List<String> names = List.of("Lewis", "Ashley", "Maggie", "Brodie");
		out.printOut(names);

		out.printOut("-----------------------");
	}

	private static OutputService getOutputServiceFromServiceLoader() {
		System.out.println("Using serviceloader for decoupled dependencies");

		ServiceLoader<OutputService> sl = ServiceLoader.load(OutputService.class);
		Iterator<OutputService> iter = sl.iterator();
		OutputService service = iter.next();

		service.printOut("Implicit output service found");
		service.printOut("-----------------------");

		return service;
	}

}
