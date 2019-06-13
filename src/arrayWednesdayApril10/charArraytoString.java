package arrayWednesdayApril10;

import java.util.Arrays;

public class charArraytoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="emray";
        char[] nameChars=str.toCharArray();
       /* System.out.println(Arrays.toString(nameChars));
        String str2=" ";
        for(int i=0;i<nameChars.length;i++) {
        	char c=nameChars[i];
        	str2=str2+c;
        	//System.out.println(c+" ");
        }
        System.out.println(str2);*/
        String str2=new String(nameChars);// buda 3.methodu char to string
        System.out.println(str2);
	}

}
