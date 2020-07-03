package sampleproject;
import java.util.*; 


//Write code to sort the list of strings using Java collection
public class program1 {
	
		public static void main(String[] args) 
		{ 
			String input[] = { "January", "February", "March", "April", "May", "June", "July",
									"august", "September", "October", "november", "December" } ;
			
			List<String> list = new ArrayList<String>(); 
			 
	        for (String val : input) 
	        { 	            
	            list.add(val); 	            
	        } 	 
	        System.out.println("Converted list:\n" + list);
	        
			// using Collections.sort method we can arrage elements in ascending order. */
			Collections.sort(list); 
			System.out.println("Sorting order for given values:\n" + list); 
			
			Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
			System.out.println("Sorting order with case sensitive:\n" + list); 
		} 
		

}
