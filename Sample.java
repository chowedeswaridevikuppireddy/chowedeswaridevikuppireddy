class Sample
{
	public static void main(String[] args)
    	{
		int num=1234,sum=0,rem=0,num1=0;
 		System.out.println("Num is: ");
		System.out.println(num);
		num1=num/10;
		rem=num%10;
		sum=num1+rem;
		System.out.println("Sum of last digit: "+sum);
	}
}