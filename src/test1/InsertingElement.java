package test1;

import java.util.Arrays;

public class InsertingElement {

	public InsertingElement() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5};
		int size=arr.length+1;
		int[] prr = new int[size];
		int key=8,index=2;
		for(int i=0;i<prr.length;i++)
		{
			if(i<=index-1)
			{
				prr[i]=arr[i];
			}
			else if(i==index)
			{
				prr[i]=key;
			}
			else
			{
				prr[i]=arr[i-1];
			}
		}
		System.out.print(Arrays.toString(prr));
	}

}
