package test2;

public class A {
	static {
		System.out.println("Hello 1 A");
	}

	public A() {
		System.out.println("Hello 3 A");
	}
	{
		System.out.println("Hello 2 A");
	}
	
	public void temp1()
	{
		System.out.println("temp function in A");
	}
}
