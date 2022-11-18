package LabTestOnJunit11;

import java.util.ArrayList;

public class Palindrome {

	public String ispalindrome(String str) {
		ArrayList<String> str1 = new ArrayList<String>();
		str1.add("Level");
		str1.add("Radar");
		str1.add("MAAM");
		str1.add("python");

                int n = str1.size();
                String[] arr = new String[n];
                //ArrayList to Array
                str1.toArray(arr);
		for(int i=0;i<n;i++)
			arr[i] = str1.get(i);
		
		for(int i=0;i<n;i++){
			System.out.print(arr[i]);
			if(i!=n-1)
			 System.out.print(", ");			
		}
		return str;
		
		
	}
	}


