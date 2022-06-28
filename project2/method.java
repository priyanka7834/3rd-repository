package package2;

public class method 
{
public void m ()
{
	this.m3();
	System.out.println("i am default constructor");
}
	
public void m1()
{
	this.m();
	
	
	
	System.out.println("i am 1 parameterized constructor");
}
	public void m2()
	{
		this.m1();
		System.out.println("i am 2 parameterized constructor");
		
	}
	
	public void m3()
	{
		System.out.println("i am 3 parameterized constructor");
	}
public void m4()
{
	this.m2();
	System.out.println("i am 4 parameterized constructor");
}
public static void main(String[] args) {
	

method obj=new method();
obj.m4();
}

}



