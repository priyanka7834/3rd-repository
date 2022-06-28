package package2;

public class assignment1 
{
public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("sum is ="+c);
	return c;
}
public int sum1(int sum,int f) 
{
int g;
g=sum+f;
System.out.println("sum1 is ="+ g);
return g;
}
public int sub (int sum1,int y)
{
int z;
z=	sum1-y;
System.out.println("sub is ="+ z);
return z;
}
public int mul(int sub,int s)
{
	int d;
	d=sub*s;
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
	int sum=pri.sum(10,2);
	int sum1=pri.sum1(sum, 2);
	int sub=pri.sub(sum1, 2);
	int mul=pri.mul(sub, 2);
	int div=pri.div(mul, 2);
}
	
}	

