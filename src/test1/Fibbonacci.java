package test1;

public class Fibbonacci {

	public Fibbonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		boolean val=checkPrime(8);
		System.out.print("Val:: "+val);

	}
	
	public static int fibo(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	public static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
	}

}
