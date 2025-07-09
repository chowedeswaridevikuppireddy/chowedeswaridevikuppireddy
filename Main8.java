class Main
{
	public static void main(String[] args)
	{
		System.out.println("before calling");
		System.out.println("hello world");
		Student student1=new Student();
		student1.method1();
		System.out.println("before calling");

	}

class Student
	    {

		void method1()
		{
			System.out.println("hi");
		}

	    }
}