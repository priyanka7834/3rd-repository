
package package2;

public class cons {
	public cons()
	{
		
		System.out.println("default constructor");
	}
	public cons(int a)
	{
		this(6,7,9,10);
		System.out.println("one parameterized");
	}
public cons(int x,int y)
{
	 this(8);
	System.out.println("two parameterized");
}
public cons(int e,int f,int g)
{
	this(4,5);
	System.out.println("three parameterized");
	
}
public cons(int o,int p,int q,int r)
{
	
	System.out.println("four parameterized");
}
public static void main(String[] args) 
{
cons ref=new cons(1,2,3);	

}
}
