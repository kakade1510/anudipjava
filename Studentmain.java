package Collection.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



public class Studentmain { 
 
 public static void fillset()
	{
	 
	ArrayList <Student> st=new ArrayList<>(); 
    Student st1=new Student(100,"prachi",  "9086594236"); 
    Student st2=new Student(200,"kartik",  "9990594236"); 
   Student st3=new Student(300,"aannya", "7988594236"); 
	    
    st.add(st1); 
    st.add(st2); 
    st.add(st3); 
	    
      ArrayList <Student> str=new ArrayList<>();
	  Student str1=new Student(400,"manisha", "7986594236");
	  Student str2=new Student(500,"Sandip", "786594236"); 
      Student str3=new Student(600,"mahesh", "8886594236");
	   
	    str.add(str1); 
	    str.add(str2); 
	    str.add(str3); 
	    
	    st.addAll(str); 
	
	    Iterator<Student>itr= st.iterator(); 
		
		while(itr.hasNext()) 
		{
			System.out.println(itr.next()); 
		}
		
		Collections.sort(st, new IdComparator()); 
		
		System.out.println("\nAfter sorting Student id....... ");
		itr=st.iterator(); //iterator
		   
		while(itr.hasNext())  //while loop
		{
			System.out.println(itr.next()); 
		}
		}
	   

	public static void main(String[] args) { 
		fillset(); 
		

	}

}
