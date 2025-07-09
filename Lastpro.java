class Lastpro
{
	public static void main(String[] args)
	{
		int end=19,pro=1,rem;
		for(int start=13;start<=end;start++)
		{
			rem=start%10;
			System.out.println(rem);
			pro=pro*rem;
		}
		System.out.println("pro is " + pro);
	}
}
