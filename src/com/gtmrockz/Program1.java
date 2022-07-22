package com.gtmrockz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program1 {
	public static void main(String[] args) 
	{
		String s = "abcabcbb";
		char[] arr = s.toCharArray();
        int sum = 1;
        int mapIt = 0;
        int start = 0;
        int end = 0;
        Map<Integer,String> hMap = new HashMap<Integer,String>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                end +=1;
                hMap.put(Integer.valueOf(mapIt),s.substring(start,end));
            }
            else
            {
                start+=1;
                mapIt +=1;
            }
        }
        ArrayList<String> alist = new ArrayList(hMap.values());
        alist.forEach(x->System.out.println(x));
	}
}
