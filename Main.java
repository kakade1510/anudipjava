package Member.com;

public class Main {

	public static void main(String[] args) {
      Employee emp = new Employee();
      emp.name= "pratibha";
      emp.age=46;
      emp.number="9423878729";
      emp.address="Honaji nager,Aurangabad-431008";
      emp.salary=2000;
      
      
      
      
    System.out.println("Name of employee is "+emp.name);
  	System.out.println("age of employee is "+emp.age);
  	System.out.println("number of employee is "+emp.number);
  	System.out.println("address of employee is "+emp.address);
  	System.out.println("salary of employee is "+emp.salary);
  	
  	
  	
  		
  		Manager mn = new Manager();  
  		mn.name= "pratik";
  		mn.age=28;
  		mn.number="1234567890";
  	    mn.address="radha swami colony,Aurangabad-431001";
  		mn.salary=100000;
  		

        System.out.println("\n Name of Manager is " +mn.name);
    	System.out.println("age of Manager is "+mn.age);
    	System.out.println("number of Manager is "+mn.number);
    	System.out.println("address of Manager is "+mn.address);
    	System.out.println("salary of Managere is "+mn.salary);		
  		
      
      
      
      
	}

}
