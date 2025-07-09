class Rev2
{
	public static void main(String[] args)
	{
		int num=95263,rem=0,count=0,prod=1,prod1=1,copy=0;
		while(num>0)
		{
			rem=num%10;
			count++;
			if(count==1 || count==2)
				prod=prod*rem;
			else if(count==3 || count==4)
				prod1=prod1*rem;
			else
				copy=rem;
			num=num/10;
		}
			System.out.println(prod+prod1+copy);
	}
}

 