package package2;

public class parent 
{
	public parent () 
	{
	this(1,2,3);
	System.out.println("parent default constructor ");
}
	 public parent (int z)
	 {
	this();
	System.out.println("parent one parameterized constructor");
	}
	 public parent(int x,int y)
	 {
	 	this(2);
	 	System.out.println("parent two parameterized constructor");
	 }
public parent(int a,int b,int c)
{
	
	System.out.println("parent three parameterized constructor");
}

	public static void main(String[] args)
{
parent p=new parent(2,3);

}
}


