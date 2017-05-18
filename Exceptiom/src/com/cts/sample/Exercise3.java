package com.cts.sample;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CreateArray c = new CreateArray();
        c.CreateObjects();
        
       
		}

}

class CreateArray{
	
	public void CreateObjects()
	{
         Student1 s1 = new Student1("abhi1",96);
         Student1 s2 = new Student1("abhi2",93);
         Student1 s3 = new Student1("abhi3",92);
         Student1 s4 = new Student1("abhi4",98);
         Student1 s5 = new Student1("abhi5",91);
         Student1 s6 = new Student1("abhi6",99);
         Student1[] array1 = {s1,s2,s3,s4,s5,s6};

         ArrayList<Student1>ar=new ArrayList<Student1>(Arrays.asList(array1));
         List<Student1>br=new ArrayList<Student1>();
         
         System.out.println("Original list");
         for (Student1 o:ar)
         {
		    System.out.println(o.name+"  "+o.marks);
        	 
         }
         
         br =  ar.subList(3,5);
         
         System.out.println("Sublist");
         for (Student1 o:br)
         {
		    System.out.println(o.name+"  "+o.marks);
        	 
         }
         
         ar.removeAll(br);
         
         System.out.println("Sublist removed from the Original list");
         for (Student1 o:ar)
         {
			System.out.println(o.name+"  "+o.marks);
        	 
         }
         
         
         
	}
}

class Student1 {
	String name;
	int marks;
	Student1(String i,int j)
	{
		this.name = i;
		this.marks = j;
	}

}





