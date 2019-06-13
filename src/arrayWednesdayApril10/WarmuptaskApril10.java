package arrayWednesdayApril10;

import java.util.Arrays;

public class WarmuptaskApril10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[5];//default va;ue is null for each items.
        names [0]="abc";
        names [1]="ef";
        names[3]="gf";
        System.out.println(Arrays.deepToString(names));
        String names2[]=new String[] {"aaa","bbb","ccc"};
        int x=0;
        while(x<names2.length) {
        	System.out.println(names2[x]);
        	x++;
        }
        String[]names3= {"aaa","bbb","ccc"};//this must happen in one statement.
	}

}
