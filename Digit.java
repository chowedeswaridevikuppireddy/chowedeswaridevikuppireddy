class Digit
{
	public static void main(String[] args)
	{
		int num=9747;
		int num1,rem=0,num2=0,num4=0;
		if(num%2==0)
		{
		System.out.println("even number");
		num1=num/100;
		rem=num%100;
		num2=num1+rem;
		System.out.println("total value is: " + num2);	
		}
		else 		{
		System.out.println("odd number");
		num1=num/100;
		rem=num%100;
		num4=num1-rem;
		System.out.println("total value is: " + num4);	
		}
				
	}
}