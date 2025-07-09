class LastSqrt
{
	public static void main(String[] args)
	{
		int end=20,rem;
		for(int start=10;start<=end;start++)
		{
			rem=start%10;
			double d=Math.sqrt(rem);
			if((int)d==d)
			System.out.println(d);	
		}		
	}
}