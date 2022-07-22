package com.gtmrockz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CollectionDemo 
{

	  public static void main(String[] args) {
	  
		  Person gowtham = new Person(1, "Gowtham");
		  Person arun = new Person(2, "Arun");
		  Person venkat = new Person(3, "Venkat");
	  List<Person> strList = new ArrayList<Person>();
	  strList.add(gowtham);
	  strList.add(arun);
	  strList.add(venkat);
	  Predicate<Person> predicate = p -> p.getName().endsWith("m");
	  Predicate<Person> predicate1 = p -> p.getName().startsWith("G");
	  
	  Function<Person,String> function = p->p.getName();
//	  strList.sort((Person s1,Person s2) -> s1.getName().compareTo(s2.getName()));
//	  System.out.println(strList);
	  strList.stream().filter(predicate.and(predicate1)).forEach(System.out::println);
	  System.out.println(predicate.test(gowtham));
	   
	}
}
