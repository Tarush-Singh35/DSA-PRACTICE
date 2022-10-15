package test1;

public class Square extends Polygon{
	
	public void render()
	{
		System.out.println("Hello Square");
	}
	
	public static void main(String[] args)
	{
		Polygon c= new Square();
		c.render();
	}


}
