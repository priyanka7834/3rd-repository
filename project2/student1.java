package package2;

public class  student1 {
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
		public void display2()
		{
			System.out.println("automation is very easy");
		}
		
	
	public static void main(String[] args) 
	{
	student1 abc=new student1();
	abc.display1();
	abc.display2();
	abc.age=25;
	System.out.println("age is="  +abc.age);
	abc.rollno=5;
	System.out.println("rollno is="  +abc.rollno);
	}
}
	

