package com.cts.sample;

import static java.nio.file.StandardOpenOption.CREATE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Exercise2 e= new Exercise2();
		e.link();
		       	 
	}

	public static void link() throws IOException {
		   TextFile1 text = new TextFile1();
		   LinkedList<Integer> list = new LinkedList<Integer>();
		   text.load();
		   for (int i=0;i<text.ab1.length;i++){
				int val = Integer.parseInt(text.ab1[i]);
				list.add(list.size()/2,val);
			}
		    ListIterator<Integer> litr = list.listIterator();
			while(litr.hasNext()){
				 System.out.println(litr.next());
	}

	}
}

class TextFile1 {
	String ab1[];
	public void load() throws IOException {
		Path file = Paths.get("datafiles/textfiles");
		Files.createDirectories(file);
		Path abspath = Paths.get("datafiles/textfiles", "abhi3.txt");
		BufferedWriter br=Files.newBufferedWriter(abspath, CREATE);
		String para="1 2 4 6 3 7 4 3 7";
		br.write(para,0,para.length());
		br.flush();
		BufferedReader rd = Files.newBufferedReader(abspath);
		String s;
		String[] ab = null;
		while((s=rd.readLine())!=null){
			ab1 = s.split("\\s");	
		
		}		

}
}	

