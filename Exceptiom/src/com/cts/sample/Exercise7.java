package com.cts.sample;

import java.util.*;


public class Exercise7 {

	public static void main(String[] args) {
		AddCountryHash x = new AddCountryHash();
        x.Add();
        System.out.println("Hash List "+ x.d );
        
		AddCountryLink y = new AddCountryLink();
        y.Add();
        System.out.println("Link List "+ y.e );

		AddCountryTree z = new AddCountryTree();
        z.Add();
        System.out.println("Tree List "+ z.f );
	}   

}


class AddCountryHash
{
	HashSet<String> d = new HashSet<String>();
	public void Add()
	{
	
	  d.add("India");
	  d.add("India");
	  d.add("India");
	  d.add("India");
	  d.add("India");
	  d.add("India");
	  
	}

  
}


class AddCountryLink
{
	HashSet<String> e = new LinkedHashSet<String>();
	public void Add()
	{
	
	  e.add("India");
	  e.add("India");
	  e.add("India");
	  e.add("India");
	  e.add("India");
	  e.add("India");
	  
	}
  
}


class AddCountryTree
{
	TreeSet<String> f = new TreeSet<String>();
	public void Add()
	{
	
	  f.add("India");
	  f.add("India");
	  f.add("India");
	  f.add("India");
	  f.add("India");
	  f.add("India");
	  
	}
  
}