class Age3
{
	public static void main(String[] args)
	{
		int age=20;
		if(age>=60 && age<=100)
			System.out.println("Senior citizen");
		else if(age>=18 && age<=60)
			System.out.println("major");
		else if(age>0 && age<18)
			System.out.println("minor");
	}
}