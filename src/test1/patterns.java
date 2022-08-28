package test1;

import java.util.Scanner;

public class patterns {

	public patterns() {
		// TODO Auto-generated constructor stub
	}
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Value for row");
		int n=sc.nextInt();
		System.out.println("==========Pattern Starts over Here=========");
		//int i = 1; i < n; i++
		for (int i = 1; i < n; i++) {
				for (int j = i; j <=n; j++){
					System.out.print("  ");
				}
				//int k=1;k<i;k++
				for(int k=1;k<i;k++)
				{
					System.out.print(" *");
				}
				for(int k=1;k<=i;k++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		for (int i = 1; i <= n; i++) {
			for (int k=1;k<=i;k++){
				System.out.print("  ");
			}
			for(int j = i; j <n; j++)
			{
				System.out.print(" *");
			}
			for(int j = i; j <=n; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("================================");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1 ");
					
				}
				else
				{
					System.out.print("0 ");
					
				}
			}
			System.out.println();
		}
		System.out.println("================================");
		for(int i=1;i<=n;i++)
		{
			for(int j=1,k=1;j<=i;j++,k++)
			{
				System.out.print(k);
				
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1,k=i;j<=i;j++,k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		System.out.println("================================");
		int t=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(t);
				t++;
			}
			//t++;
			System.out.println();
		}
		System.out.println("================================");
		for(int i=1;i<=n;i++)
		{
			for(int j=1,k='A';j<=i;j++,k++)
			{
				System.out.print((char)k);
			}
			//t++;
			System.out.println();
		}
		
		System.out.println("================================");
		for(int i=1,k='A';i<=n;i++,k++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)k);
			}
			//t++;
			System.out.println();
		}
		System.out.println("============Hollow Pattern=============");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||j==n||i==n)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}


	