class Perfect
{
	public static void main(String[] args)
	{
		int end=10,num=10,sum=0,pro=1;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			{
				sum=sum+start;
				pro=pro*start;
			}
		}
		
			System.out.println(sum);
			System.out.println(pro);
			if(sum==pro)
				System.out.println("perfect number");
			else
				System.out.println("not a perfect number");

	}
}