package toto;
 import java.util.*;
 
 
public class prj {
	public static void main(String args[]) {
		 Employee janeJones = new Employee("Jane", "Jones", 123);
	        Employee johnDoe = new Employee("John", "Doe", 4567);
	        Employee marySmith = new Employee("Mary", "Smith", 22);
	        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
	        Employee billEnd = new Employee("Bill", "End", 78);

	         ArrayQueue queue = new ArrayQueue(5);
	         queue.add(billEnd);
	         queue.add(johnDoe);
	         queue.add(marySmith);
	         queue.add(janeJones);
	       //  queue.printQueue();
	         queue.remove();
	        queue.printQueue();
	       // System.out.println(queue.peek()); 
	        queue.add(mikeWilson);
	        System.out.println(".......");
	        queue.printQueue();
	        

	    
	

}
}
	
 
	 

 



  
 
			    
		   
		 
		     
		
	


				 
 
		 
		  
		  
		 
		 
			
		
	

	

	 
	
		
	

        	 
            
        
			 
	 
	
	
	
	
	

	 

	 
	


