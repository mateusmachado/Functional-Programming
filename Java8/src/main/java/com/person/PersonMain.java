package com.person;

import java.util.function.Predicate;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		setPersonProperties(person);
		Predicate<Person> adulthood = p -> p.getAge() > 18;

		processAge(person, adulthood);
	}

	private static void setPersonProperties(Person person) {
		person.setName("Matt");
		person.setAge(24);
		person.setNationality("Brazilian");
	}

	public static void processAge(Person person, Predicate<Person> predicate) {
		if (predicate.test(person))
			System.out.println(String.format("%s Adult.", person.getAge()));
	}
}
