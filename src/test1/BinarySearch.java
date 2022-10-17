package test1;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}
	
	public int maximzation(int[] arr,int target)
	{
		int l=-1;int h=arr.length;
		int mid;
		while(l+1<h)
		{
			mid=l+(h-l)/2;//Avoid the overflow
			if(MonotonicFunction(arr,mid))
			{
				l=mid;
			}
			else
			{
				h=mid;
			}
		}
		return l;
	}
	
	public int Minimization(int[] arr,int target)
	{
		int l=-1;int h=arr.length;
		int mid;
		while(l+1<h)
		{
			mid=l+(h-l)/2;//Avoid the overflow
			if(MonotonicFunction(arr,mid))
			{
				h=mid;
			}
			else
			{
				l=mid;
			}
		}
		return h;
	}

	private boolean MonotonicFunction(int[] arr, int mid) {
		//Condition
		return true;
	}

}
