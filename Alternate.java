// Create two arrays of ints. Add alternate elements of first array to the second array.
//Write a method to print addittion of values stored a array.
 class Alternate {
	 


			 public static void main(String[] args) {

				 //create a arry 1 & 2
			   int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			   int[] numbers2 = {1, 3, 5, 7, 9};
			   int sum = 0;
			
			   
			   // access all elements using for each loop
			   // add each element in sum
			   for (int number2: numbers2) {
			     sum += number2;
			   }
			  
			   // get the total number of elements
			   int arrayLength = numbers2.length;

			   System.out.println("Sum = " + sum);
			   
			 
			 
			 }
	      }

