package package2;

import java.util.Scanner;

public class scanner2 
{
public int mul(int x1,int x2)
{
			int mulresult=x1*x2;
			System.out.println("mulresult="+mulresult);
			
			return mulresult;
		}
		public int sub(int mul,int x3)
		{
			int subresult=mul-x3;
			System.out.println("subresult="+subresult);
			
			return subresult;
			
		}
		public int mul2(int sub,int x4)
		{
			int mulresult2=sub*x4;
			System.out.println("mulresult2="+mulresult2);
			
			return mulresult2;
		}
		public int sum2(int mul2,int x5)
		{
			int sumresult2=mul2+x5;
			System.out.println("sumresult2 ="+sumresult2);		
			return sumresult2;
		}
		public void div(int sum2,int x6)
		{
			
			int divresult=sum2/x6;
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

	scanner2 obj=new scanner2();
	int mulresult=obj.mul(x1, x2);


	int subresult=obj.sub(mulresult, x3);


	int mulresult2=obj.mul2(subresult,x4);


	int sumresult2=obj.sum2(mulresult2,x5);


	obj.div(sumresult2,x6);


	}
	}




