package com.test_01;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(12);
		ls.add(13);
		System.out.println(ls);
		
		Integer [] arr = new Integer [ls.toArray().length];
		     
		for(int k = 0; k < ls.toArray().length; k++){  
		    arr[k] = Integer.parseInt(ls.toArray()[k].toString());  
		    System.out.println(arr[k]);  
		}  
		
		for(int i= 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length;j++){
				if((int)arr[i] > (int)arr [j]){
					int temp = (int) arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}

