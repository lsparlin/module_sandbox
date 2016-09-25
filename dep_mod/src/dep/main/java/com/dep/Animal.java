package com.dep;

import com.dep.util.*;

public class Animal {

	public void speak() {
		System.out.println(SomeUtil.getMostCommonAnimalNoise());
	}

	public boolean doesHibernate() {
		return false;
	}
}
