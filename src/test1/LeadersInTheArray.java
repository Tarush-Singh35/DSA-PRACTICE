package test1;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInTheArray {

	public LeadersInTheArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		int n=arr.length;
		ArrayList<Integer> prr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int max=arr[i];
			for(int j=i;j<n;j++)
			{
				if(arr[j]>max)
				{
					prr.add(arr[j]);
				}
				
			}
		}
		System.out.print(Arrays.toString(prr.toArray()));
	}
}
