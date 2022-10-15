package test1;

public class UnionQuickFind {
	
	private int[] arr;

	public UnionQuickFind(int N) {
		// TODO Auto-generated constructor stub
		arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=i;
		}
	}
	
	public boolean quickFindConnected(int index1,int index2)
	{
		return arr[index1]==arr[index2];
	}
	public void unionQuickFind(int index1,int index2)
	{
		//this updates the value of every Index
		int val1=arr[index1];
		int val2=arr[index2];
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			if(arr[i]==val1)
			{
				arr[i]=val2;
			}
		}
	}

}
