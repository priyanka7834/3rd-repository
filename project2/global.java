package package2;

public class global {

	int priyanka;// global varriable --scope in class
	public void m1(int pri)//local varriable---scope in method
	{
		System.out.println(pri);
		pri=priyanka;
		System.out.println(pri);
	}
	public static void main(String[] args) 
	{
	global obj=new global();
	obj.m1(10);
	
	}
	
	
}
