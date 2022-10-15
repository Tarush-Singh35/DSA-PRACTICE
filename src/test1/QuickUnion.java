package test1;

public class QuickUnion {	
	private int[] arr;
	public QuickUnion(int N) 
	{
		arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=i;
		}
	}
	
	public int root(int i)
	{
		//This does arr[arr[arr[...arr[i]]]] to get the root
		while(i!=arr[i])
		{
			i=arr[i];
		}
		return i;
	}
	public boolean find(int p,int q)
	{
		return root(p)==root(q);
	}
	public void union(int p,int q)
	{
		int val1=root(p);
		int val2=root(q);
		arr[val1]=val2;
	}
}