package package2;

public class debug 
{
int priyanka;
public void m1()
{
	System.out.println("first method");
System.out.println("first method second line");
}
public void m2()
{
	System.out.println("second method");
	System.out.println("second method second line");
}
public static void main(String[] args)
{
debug obj=new debug();
System.out.println("main method second line");
obj.m1();
System.out.println("main method third line");
System.out.println("main method forth line");
obj.m2();
}
}

