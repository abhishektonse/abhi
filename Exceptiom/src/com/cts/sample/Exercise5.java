package com.cts.sample;

import static java.nio.file.StandardOpenOption.CREATE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Mappy.occur();
 
}



static class TextFile5 {
	static String ab1[];
	public static String[] load() throws IOException {
		Path file = Paths.get("datafiles/textfiles");
		Files.createDirectories(file);
		Path abspath = Paths.get("datafiles/textfiles", "abhi3.txt");
		BufferedWriter br=Files.newBufferedWriter(abspath, CREATE);
		String para="jack and jill went up the hill";
		br.write(para,0,para.length());
		br.flush();
		BufferedReader rd = Files.newBufferedReader(abspath);
		String s;
		String[] ab = null;
		while((s=rd.readLine())!=null){
			ab1 = s.split("");	
		
			
		}		
		return ab1;

}
}	

static class Mappy{
	
   public static void occur()
   {
	 Map<String,Integer> occ = new HashMap<String,Integer>();
     try {
		TextFile5.load();
	
      for (String c : TextFile5.ab1)
      {
          if(occ.containsKey(c))
          { 
              occ.put(c, occ.get(c)+1);
        		  
          }
          else
          {
              occ.put(c, 1);
          }
      }

      System.out.println(occ);
      
			
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
  }
}


