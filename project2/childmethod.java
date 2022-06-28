package package2;

public class childmethod extends parentmethod
{


public void cm ()
{
	this.cm2(1, 2);
	System.out.println("child default method");
}
	
public void cm1(int a)
{
	
	this.cm();
	
	
	System.out.println("child 1 parameterized method");
}
	public void cm2(int x,int y)
	{
		super.pm2(1,2);
		System.out.println("child 2 parameterized method");
		
	}
	
	public void cm3(int a,int b,int c)
	{
		this.cm1(1);
		System.out.println("child 3 parameterized method");
	}
public static void main(String[] args) {
	childmethod obj=new childmethod();
	obj.cm3(1,2,3);	
}
	

}




