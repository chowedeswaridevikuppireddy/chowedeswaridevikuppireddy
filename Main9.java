class Main9
	{
		Student student1=new Student();
		student1.roll=10;student1.name="abc";
		student1.m1=15;student1.m2=20;student1.m3=21;
		System.out.println(student1.calTotal());
	}
	
class Student
	{
		int roll,m1,m2,m3;
		String name;
		int calTotal()
		{
			return m1+m2+m3;
		}
	}