package com.person;

import java.util.function.Predicate;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();

		person.setName("Matt");
		person.setAge(24);
		person.setNationality("Brazilian");
			
		Predicate<Person> compareAge = p -> p.getAge() > 18;
		boolean b1 = compareAge.test(person);
		System.out.println(b1 ? "Adult" : "Child");	
	}
}
