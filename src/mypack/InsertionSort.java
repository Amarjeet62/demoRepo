package mypack;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int num[] = {7,3,9,4,2,5};{
			System.out.println("Unsorted num:"+Arrays.toString(num));
		}
		int temp , j;
		for (int i=1;i<=num.length-1;i++) {
			temp=num[i];
			j=i-1;
			while(j>=0 && temp <=num[j]) {
				num[j+1]=num[j];
				j=j-1;
		}
		num[j+1]=temp;	
		}
			System.out.println("Sorted num:"+Arrays.toString(num));
		}
	}

