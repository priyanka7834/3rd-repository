package package2;

public class assignment2 {

	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("sum is ="+c);
		return c;
	}
	public int sum(int sub,int f) 
	{
	int g;
	g=sub+f;
	System.out.println("sum is ="+ g);
	return g;
	}
	public int sub1 (int sum,int y)
	{
	int z;
	z=	sum-y;
	System.out.println("sub1 is ="+ z);
	return z;
	}
	public int mul(int sub1,int s)
	{
		int d;
		d=sub1*s;
		System.out.println("mul is =" +d);
		return d;
	}
	public int div(int mul, int n)
	{
		int k;
		k=mul/n;
		System.out.println("div is=" +k);
		return k;
		
	}
	public static void main(String[] args) {
		assignment1 pri=new assignment1();
		int sub=pri.sub(10,2);
		int sum=pri.sum(sub, 2);
		int sub1=pri.sub(sum, 2);
		int mul=pri.mul(sub, 2);
		int div=pri.div(mul, 2);
	}
}
