package com.gtmrockz;

import java.util.ArrayList;
import java.util.List;

public class DemoClass {
	
	
//Comparator comp = new Comparator(Employee)
//{
//	public int compare(Employee emp,Employee emp1)
//	{
//		return emp.getName().compareTo(emp1.getName());
//		
//	}
//};
//
//list.stream().filter(p->p.getSalaray() > 20000).sorted(Comparator.comparing(Employee::getName())).forEach(System.out::println);
	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "ttes";
		
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		for(char c:charArr1)
		{
			list1.add(c);
		}
		for(char c:charArr2)
		{
			list2.add(c);
		}
		
		if (list1.size()== list2.size() && list1.containsAll(list2))
		{
			System.out.println("Given Strings are anagram");
		}
		else
		{
			System.out.println("Given Strings are not anagram");
		}
	}
	

}
