package com.gtmrockz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	Map<String,String> familyMap = new HashMap<String,String>();
	ArrayList<String> fatherFamily = new ArrayList<String>(Arrays.asList("Arumugam","Mallammal","Jothimani","Ashokkumar"));
	ArrayList<String> motherFamily = new ArrayList<String>(Arrays.asList("Mallichettiyar","Janaki","Mani","Chandran","Jaishankar","Susila","Selvaraj"));
	fatherFamily.forEach(s->familyMap.put(s, "Ashokkumar"));
	motherFamily.forEach(s->familyMap.put(s, "Susila"));
	familyMap.entrySet().forEach(
				s -> {
					
					if(s.getValue() == "Ashokkumar")
				{
					System.out.println(s.getKey());
				}
				});
	familyMap.entrySet().forEach(
				s -> {
					
					if(s.getValue() == "Susila")
				{
					System.out.println(s.getKey());
				}
				});	
				
	}	

}
