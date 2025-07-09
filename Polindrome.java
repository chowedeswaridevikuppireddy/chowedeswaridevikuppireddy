class Polindrome
{
	public static void main(String[] args)
	{
		int num=11211,num1=num,rev=0,rem=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
			if(num1==rev)
				System.out.println("palindrome");

	}
}
