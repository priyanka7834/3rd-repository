package package2;

public class constructor {
	public constructor()
	{
		
		System.out.println("default constructor");
	}
	public constructor(int a)
	{
		this(6,7);
		System.out.println("one parameterized");
	}
public constructor(int x,int y)
{
	 this(3,6,8);
	System.out.println("two parameterized");
}
public constructor(int e,int f,int g)
{
	
	System.out.println("three parameterized");
	
}
public constructor(int o,int p,int q,int r)
{
	this(1);
	System.out.println("four parameterized");
}
public static void main(String[] args) 
{
constructor ref=new constructor(1,2,3,4);	

}
}
