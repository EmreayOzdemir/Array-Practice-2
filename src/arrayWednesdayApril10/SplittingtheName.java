package arrayWednesdayApril10;

import java.util.Arrays;

public class SplittingtheName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Java is fun, java is challenging";
     str.split("");
     String [] words=str.split(" ");
     System.out.println(Arrays.toString(words));
     String [] parts=str.split("a");
     System.out.println(Arrays.toString(words));
     String [] parts2=str.split("is");
     System.out.println(Arrays.toString(parts2));
     String [] parts3=str.split("");
     System.out.println(Arrays.toString(parts3));
	}

}
