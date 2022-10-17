package test1;

public class QuickUnion {	
	private int[] arr;
	private int[] size;
	public QuickUnion(int N) 
	{
		arr=new int[N];
		size=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=i;
			size[i]=1;
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
		return rootWithPathCompression(p)==rootWithPathCompression(q);
	}
	public void union(int p,int q)
	{
		int val1=root(p);
		int val2=root(q);
		if(val1==val2)
		{
			return;
		}
		
		arr[val1]=val2;
	}
	
	public void unionModify(int p,int q)
	{
		int root1=root(p);
		int root2=root(q);
		if(root1==root2)
		{
			return;
		}
		if(size[root2]>size[root1])
		{
			size[root2]+=size[root1];
			arr[root1]=root2;
		}else
		{
			size[root1]+=size[root2];
			arr[root2]=root1;
		}		
	}
	
	public int rootWithPathCompression(int i)
	{
		int val=i;
		//This does arr[arr[arr[...arr[i]]]] to get the root
		while(i!=arr[i])
		{
			i=arr[i];
		}
		while(val!=i)
		{
			int temp=arr[val];
			arr[val]=i;//Path Compression
			val=temp;
		}
		return i;
	}
	public int componentSize(int p)
	{
		return size[rootWithPathCompression(p)];
	}
}