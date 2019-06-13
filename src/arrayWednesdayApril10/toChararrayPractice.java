package arrayWednesdayApril10;

import java.util.Arrays;
import java.util.Scanner;

public class toChararrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    String name=scan.next();
    //ask user to enter the char to count
    //since we cannot store user input as a character
    //we will just ask for String then turn it into character
    //for ex:if user enter "a
//---->"A".charAt(0)--->'a'.    
    System.out.println("enter char to count");
    String charToCount=scan.next();
    char [] nameChars=name.toCharArray();
    System.out.println(Arrays.toString(nameChars));
    int counter=0;
    for(int i=0;i<nameChars.length;i++) {
    	if(nameChars[i]=='a') {
    		counter++;
    	}
    }
    System.out.println("the count of : " + counter);
    }

}
