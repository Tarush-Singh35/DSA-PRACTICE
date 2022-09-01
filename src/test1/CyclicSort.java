package test1;

import java.util.Arrays;

public class CyclicSort {

	public CyclicSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[])
	{
		int[] arr= {4,3,2,1};
		System.out.println(Integer.MAX_VALUE);
		cyclicSort(arr);
	}
	
	static void cyclicSort(int arr[])
	{
		int size=arr.length;
		int i=0;
		while(i<size) {
			int correctIndex=arr[i]-1;
			if(arr[i]!=arr[correctIndex])
			{
				swap(arr,i,correctIndex);
				
			}else
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
