package com.cts.sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Ex6AddCountry
{
	static List<String> c = new ArrayList<String>();
	static List<String> l = new LinkedList<String>();
	public static List Add(List c)
	{
		  System.out.println("in 1");
	  c.add("India");
	  c.add("USA");
	  c.add("UK");
	  c.add("Brazil");
	  c.add("Canada");
	  c.add("France");
	  c.add("Mexico");
	  c.add("Sweden");
	return c;
	  
	}
	
	
	public static LinkedList Add(LinkedList l)
	{
      System.out.println("in 2");
	  l.add("India");
	  l.add("USA");
	  l.add("UK");
	  l.add("Brazil");
	  l.add("Canada");
	  l.add("France");
	  l.add("Mexico");
	  l.add("Sweden");
	return l;
	  
	}
  
}


