package HW9;

import java.util.*;
import java.util.function.*;

public class Q47 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("-5");
		list.add("0");
		list.add("5"); 
		print(list, e -> e < 0); 
		
	}
	
	public static void print(List<String> list, Predicate<Integer> p) {
		//for (String num : list)
			//if (p.test(num)) // integer de�er bekliyor. fakat string tan�ml� yukar�da.
			//	System.out.println(num);
		}
	}
