package myfirst;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.text.*;
import java.time.*;
import java.util.Calendar;
import java.util.regex;
import java.util.regex.Pattern;


public class myfirst {
 public static void main(String[] args)
 {
	 try
	 {
		 File obj = new File("D:\\challenge.txt");
		 if(obj.createNewFile())	System.out.println("File created: "+ obj.getName());
		 else	System.out.println("File already exists");
		 Scanner sc = new Scanner(obj);
		 
//		 while(sc.hasNextLine())
//		 {
//			 String s = sc.nextLine();
//			 System.out.println(s);
//		 }
		 while(sc.hasNextLine())
		 {
			 String str = sc.nextLine();
			 str = str.trim();
			 String[] sarr = str.split(" ");
			 
			 String reg = "[7-9]{1}[0-9]{9}";
			 if(Pattern.matches(reg, sarr[1]))	
				 {
				 System.out.println(sarr[0]);
				 File obj2 = new File(sarr[0]+".text");
				 if(obj2.createNewFile())	System.out.println("Created");
				 else	System.out.println("Exist");
				 Calendar c = Calendar.getInstance();
				 FileWriter wr = new FileWriter(sarr[0]+".text");
				 wr.write(c.getTime().toString());
				 wr.close();
				 System.out.println(c.getTime());
				 }
			 
			 
			 
		 }
		 
	 }
	 catch(IOException e)
	 {
		 System.out.println("Error occurred");
		 e.printStackTrace();
	 }
	 
 }
}
 