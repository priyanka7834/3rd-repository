package package2;

import java.util.Scanner;

public class scanner1
{
	public int sum(int x1,int x2)
	{
		int sumresult=x1+x2;
		System.out.println("sumresult="+sumresult);
		
		return sumresult;
	}
	public int sub(int sum,int x3)
	{
		int subresult=sum-x3;
		System.out.println("subresult="+subresult);
		
		return subresult;
		
	}
	public int sum2(int sub,int x4)
	{
		int sumresult2=sub+x4;
		System.out.println("sumresult2="+sumresult2);
		
		return sumresult2;
	}
	public int mul(int sum2,int x5)
	{
		int mulresult=sum2*x5;
		System.out.println("mulresult ="+mulresult);		
		return mulresult;
	}
	public void div(int mul,int x6)
	{
		
		int divresult=mul/x6;
		System.out.println("divresult ="+divresult);
	}
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);

System.out.println("enter the value of x1 ");
int x1=s.nextInt();
System.out.println("enter the value of x2");
int x2=s.nextInt();
System.out.println("enter the value of x3");
int x3=s.nextInt();
System.out.println("enter the value of x4");
int x4=s.nextInt();
System.out.println("enter the value of x5");
int x5=s.nextInt();
System.out.println("enter the value of x6");
int x6=s.nextInt();

scanner1 abc=new scanner1();
int sumresult=abc.sum(x1, x2);


int subresult=abc.sub(sumresult, x3);


int sumresult2=abc.sum2(subresult,x4);


int mulresult=abc.mul(sumresult2,x5);


abc.div(mulresult,x6);


}
}
