package arrayWednesdayApril10;

import java.util.Arrays;

public class StringArrayTaskWednesdayapril10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String myGrosery="patates, kereviz, elma, havuc";

		String [] myArr=myGrosery.split(", ");

		for (int i = 0; i < myArr.length; i++) {
		  System.out.println(myArr[i] +" lengths= "+myArr[i].length());
	//split method from string class is used to split up.String into multiple 	  
		*/
		
		
		  String groceries="tomato,cucumber,apple,orange,banana,egg,milk,broccoli,onion,cereal,pepper,tea,water,almonds";
			
			String[] grocery=groceries.split(",");
			System.out.println(Arrays.toString(grocery));
			int items=grocery.length;
			System.out.println("How many items in the list: "+items);
			for(int i=0;i<items;i++)
			{
				System.out.println("Length of Item " +i +" "+grocery[i].length());}

		
	}

}
