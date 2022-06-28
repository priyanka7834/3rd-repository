package package2;

public class calculation 
{
	public int sum(int a,int b)
	{
		int c; 
		c=a+b;
		System.out.println("sum result="+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("sub result="+z);
		return z;
	}
	public void mul(int s,int t)
	{
		int u;
		u=s*t;
		System.out.println("mul result="+u);
		
		
	}
	public static void main(String[] args) {
		calculation abc=new calculation();
		int sum=abc.sum(10,2);
		int sub=abc.sub(10,2);
		abc.mul(sum, sub);
	}
}


