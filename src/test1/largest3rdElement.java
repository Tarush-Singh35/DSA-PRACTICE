package test1;

import java.util.Arrays;

public class largest3rdElement {

	public largest3rdElement() {
	}
	
	public static void main(String[] args) {
		int[] arr= {4,1,3};
		print3rdLargestElement(arr);
		print2ndSmallestElement(arr);
		
	}
	public static int print3rdLargestElement(int[] arr)
	{
		int size=arr.length;
		int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			if(arr[i]>max1)
			{
				max3=max2;
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]<max1 && arr[i]>max2)
			{
				max3=max2;
				max2=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr)+" :: "+max3+" :: "+max2+" :: "+max1);
		return max3;
	}
	public static int print2ndSmallestElement(int[] arr)
	{
		int size=arr.length;
		int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
		for (int i = 0; i < size; i++) {
			if(arr[i]<min1)
			{
				min2=min1;
				min1=arr[i];
			}
			else if(arr[i]>min1 && arr[i]<min2)
			{
				min2=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr)+" :: "+min2+" :: "+min1);
		return min2;
	}
	

}
