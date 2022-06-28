package package2;

public class parentmethod {


	public void pm ()
	{
		this.pm3(1,2,3);
		System.out.println("parent default method");
	}
		
	public void pm1(int a)
	{
		
		this.pm();
		
		
		System.out.println("parent 1 parameterized method");
	}
		public void pm2(int a,int b)
		{
			this.pm1(1);
			System.out.println("parent 2 parameterized constructor");
			
		}
		
		public void pm3(int a,int b,int c)
		{
			System.out.println("parent 3 parameterized constructor");
		}
	public static void main(String[] args) 
	{
		parentmethod obj=new parentmethod();
		obj.pm2(1,2);	
	}
		
	}

	


