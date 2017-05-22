package com.cts.sample;

import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		List new1 = new ArrayList();
		LinkedList new2 = new LinkedList();
		new1 = Ex6AddCountry.Add(new1);
		new2 = Ex6AddCountry.Add(new2);
		   
        System.out.println("Original Array List "+ new1 );
        Collections.sort(new1);
        System.out.println("Sorted Array List "+  new1 );
        Collections.shuffle(new1);
        System.out.println("Shuffled Array List1 "+  new1 );
        Collections.shuffle(new1);
        System.out.println("Shuffled Array List2 "+  new1);
        Collections.shuffle(new1);
        System.out.println("Shuffled Array List3 "+  new1);

        
        System.out.println("Original linked List "+ new2 );
        Collections.sort(new2);
        System.out.println("Sorted linked List "+  new2 );
        Collections.shuffle(new2);
        System.out.println("Shuffled linked List1 "+  new2 );
        Collections.shuffle(new2);
        System.out.println("Shuffled linked List2 "+  new2);
        Collections.shuffle(new2);
        System.out.println("Shuffled linked List3 "+  new2);
}

}

