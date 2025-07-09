class Fact
{
	public static void main(String[] args)

	{
		int num=23;
		double fact1=1,fact2=1;
                int rem1=0,rem2=0,end=1;
		rem1=num/10;
		rem2=num%10;
		System.out.println(rem1);
		System.out.println(rem2);
		for(int i=rem1;i>=end;i--)
		{
			fact1=fact1*i;

		}
		System.out.println(fact1);
		
		for(int i=rem2;i>=end;i--)
		{
			fact2=fact2*i;
		
		}
		System.out.println(fact2);

			double factorial=(fact1/fact2);
			System.out.println(factorial);
	
         }
}