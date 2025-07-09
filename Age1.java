class Age1
{
	public static void main(String[] args)
	{
		int age=623;
		String s=(age<=0 || age>=100)?"Invalid":(age<18)?"minor":(age>=60)?"senior citizen":"major";
		System.out.println(s);
	}
}