/*Create a class Rectangle .Take two data members ---length and width.
Create two constrctors--default and parameterized(to set length and width).
write a method area() to calculate area of rectangle.
Call this method in main().*/


public class Rectangle {

	int lenght;
	int weidth;
	
	 Rectangle()    // create a default constractors
		{
			System.out.println("Constructor  .......");
	
		}
	 
	 Rectangle(int lenght , int weidth) //parameterized Constractors
		{
			
			this.lenght=lenght;
			this.weidth=weidth;
	    }
		
	 void area() 
	 {
		 System.out.println(" lenght:" +lenght);
			System.out.println(" weidth :" +weidth);
	 }
		
public static void main(String[] args) {
	
	Rectangle p1=new Rectangle();
	System.out.println("length and weidth _____ ");
	p1.lenght=10;
	p1.weidth=8;
	p1.area();
	
	
	Rectangle  p2=new Rectangle(12,20);    //call constractors
	System.out.println("Area of Ractangle  _____ ");
	p2.area();
	
	
}

}