package arrayWednesdayApril10;

import java.util.Arrays;

public class StringSplt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String shows="orville, game of throne,x-man, gifted,breaking bad";
   String [] showsArray=shows.split(",");
   System.out.println(Arrays.deepToString(showsArray));
   for(int i=0;i<showsArray.length;i++) {
	   System.out.println(showsArray[i]);//if you want to get the first one just write the 1,0,2 etc.
   System.out.println(showsArray[showsArray.length-1]);//burdada arraydeki en son item i buluyrsn
   String [] showsArray2=shows.split("game of thorenes");
   for(int j=0;j<showsArray2.length;j++) {
	   
   }
   System.out.println(showsArray[i]);
   //splitting by empty 
   
   }
	}

}
