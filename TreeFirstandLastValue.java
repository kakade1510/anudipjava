package Collection.com;

import java.util.TreeMap;

public class TreeFirstandLastValue {

	public static void main(String[] args) {//main method

	      System.out.println("(StudentList.java)!\n");
	      TreeMap <Integer, String>tMap = new TreeMap<Integer, String>();
	      tMap.put(1, "Prachi");
	      tMap.put(2, "Aradhya");
	      tMap.put(3, "pratik");
	      tMap.put(4, "Sangita");
	      tMap.put(5, "rupali");
	      tMap.put(6, "lovely");
	      tMap.put(7, "Omkar");
	      System.out.println("Keys of tree map: " + tMap.keySet());
	      System.out.println("Values of tree map: " + tMap.values());
	      System.out.println(" ");
	      
	      System.out.println(
	         "First element of ArryList Student: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()));
	      System.out.println(
	         "Last element of ArryList Student:  " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()));
	     
	   }
	}