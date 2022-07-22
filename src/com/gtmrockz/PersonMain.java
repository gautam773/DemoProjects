package com.gtmrockz;

public class PersonMain {

	public static void main(String[] args) {
Person p1 = new Person(1, "abc");
Person p2 = new Person(2, "abc");
Person p3 = new Person(2, "xyz");
Person p4 = new Person(1, "abc");
Person p5 = p1;


System.out.println(p1.equals(p2));
System.out.println(p2.equals(p3));
System.out.println(p1.equals(p4));
System.out.println(p1.equals(p5));
System.out.println(p1.hashCode());
System.out.println(p2.hashCode());
System.out.println(p3.hashCode());
System.out.println(p4.hashCode());
System.out.println(p5.hashCode());
	}

}
