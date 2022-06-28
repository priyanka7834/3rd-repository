package package2;

public class cons3 {

public cons3()
	{
		
		System.out.println("default constructor");
	}
	public cons3(int a)
	{
		this(6,7,8);
		System.out.println("one parameterized");
	}
public cons3(int x,int y)
{
	 
	System.out.println("two parameterized");
}
public cons3(int e,int f,int g)
{
	this(9,10);
	System.out.println("three parameterized");
	
}
public cons3(int o,int p,int q,int r)
{
	this(5);
	System.out.println("four parameterized");
}
public static void main(String[] args) 
{
cons3 ref=new cons3(1,2,3,4);	

}
}
