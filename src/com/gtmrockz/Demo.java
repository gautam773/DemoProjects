package com.gtmrockz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Gowtham", "DD");
		Employee emp2 = new Employee(1, "Gowtham", "DD");
		Employee emp3 = new Employee(2, "Venkatesh", "DD");
		Employee emp4 = new Employee(3, "Arun", "DD");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		/*
		 * Set<Employee> empSet = new HashSet<Employee>(); empList.forEach(p ->
		 * empSet.add(p)); System.out.println(empSet);
		 */
		
		empList.stream().distinct().forEach(System.out::println);
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Gowtham");
		hm.put(2,"Ashok");
		hm.put(3,"Abc");
		hm.put(4,"Cde");
		hm.put(5,"Fgh");
		hm.put(6,"Ijk");
		hm.put(7,"Lmn");
		hm.put(8,"Opq");
		hm.put(9,"Rst");
		hm.put(10,"Uvw");

		Set<Integer> hSet = hm.keySet();

		hSet.stream().filter(p->p>3).forEach(p-> System.out.println(hm.get(p)));
		
	}

}
