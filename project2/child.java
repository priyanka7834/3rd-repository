package package2;

public class child extends parent  
{
public child()
{
super(1,2);
System.out.println("child default constructor");
}

public child(int a)
{
this(2,3);
	System.out.println("child one parameterized constructor");	

}
public child(int b,int c)
{
	this(1,2,3);
	System.out.println("child two parameterized constructor");
}
	public child(int a,int b,int c) 
	{
		this();
		System.out.println(" child three parameterized constructor ");
}
	
public static void main(String[] args)
{

child h=new child(1);

}
}
