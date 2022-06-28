package package2;

public class assignment3 
{
	public assignment3()
	{
		System.out.println("default constructor");
	}
	
	public assignment3(int a)
	{
		System.out.println("one parameterized constructor");
	}
	public assignment3(int a,int b)
	{
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) 
	{
	assignment3 abc=new assignment3();//default
	assignment3 abc1=new assignment3(123);//one parameterized
	assignment3 abc2=new assignment3(123,456);//two parameterized
	}
}
