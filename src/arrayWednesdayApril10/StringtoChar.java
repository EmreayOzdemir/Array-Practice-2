package arrayWednesdayApril10;

import java.util.Arrays;

public class StringtoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str = "Cybertek Batch Spartan is most hardworking Batch ever" ; //tektek harfleri print ediyr
	    
	    
	    int size = str.length() ; 
	    
	   // char[] myChars = new char[ size ]; 
	    
	    //for(int i=0 ; i< myChars.length ; i++) {
	      
	      //myChars[0] = 'A' ; 
	      //myChars[i] = str.charAt(i) ; 
	      
	    //}
	    	char[] myChars = str.toCharArray(); 
	        //System.out.println(Arrays.toString(myChars)   );
	    
	    System.out.println(Arrays.toString(myChars)+ "-"   );
	    
	    
	    
	    
	}

}
