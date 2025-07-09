class Arm
{
	public static void main(String[] args)
	{
		int num=371,num1=num,res=0,sum=0,count=0,rem=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
			while(num1!=0)
			{
			rem=num%10;
		        res=(int)Math.pow(rem,count);
			sum=sum+res;
			}
		if(num1==sum)
			System.out.println("ArmStrong");
	}
}