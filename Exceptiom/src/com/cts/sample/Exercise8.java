package com.cts.sample;

import java.util.*;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new ArrayList();
		List l2 = new LinkedList();

		AddCountry2.name(l1);
    	AddCountry2.name(l2);

		ListIterator i = l1.listIterator();
		int k= l1.size();
		for (int j = (l1.size()-1); j>=0 ;j--)
		{
			
			System.out.println(j);
			l2.add(k, l1.get(j));
			k = k+1;
	        
		}
		
		
		System.out.println("arraylist=  " + l1);
		System.out.println("linked list= " + l2);

	}

}

class AddCountry2 {
	List h = new ArrayList();

	public static List name(List h) {

		h.add("India");
		h.add("UK");
		h.add("USA");
		h.add("Brazil");
		h.add("Canada");
		h.add("France");
		h.add("Mexico");
		h.add("Sweden");
		return h;

	}

}
