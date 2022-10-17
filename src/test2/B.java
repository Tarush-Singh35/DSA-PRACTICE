package test2;

public class B extends A {
	int ab=10;
	static int gh=12;
	
	static {
		System.out.println("Hello 1 B");
		int ef=12;
	}

	public B() {
		System.out.println("Hello 3 B");
	}
	
	{
		System.out.println("Hello 2 B");
		int cd=11;
	}
	
	public void temp1()
	{
		System.out.println("Temp Function in B");
	}
}
