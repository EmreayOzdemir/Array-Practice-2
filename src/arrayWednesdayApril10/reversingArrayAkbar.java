package arrayWednesdayApril10;

import java.util.Arrays;

public class reversingArrayAkbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 11,2,39,7,4,15};//reversing wiothout loop
		int count=numbers.length;
		int lastIndex=count-1;
		for(int i=0;i<count/2;i++) {
			int temp=numbers[i];
			numbers[i]=numbers[lastIndex-i];
			numbers[lastIndex-i]=temp;
		}
		/*int temp=numbers[0];
		numbers[0]=numbers[5];
		numbers[5]=temp;
		temp = numbers[1];
		numbers[1]=numbers[5-1];
		numbers[5-1]=temp;
		
		temp = numbers[2];
		numbers[2]=numbers[5-2];
		numbers[5-2]=temp;
		
		System.out.println(Arrays.toString(numbers));*/
		
	}

}
