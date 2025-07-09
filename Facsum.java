class Facsum
{
	public static void main(String[] args)
	{
		int end=10,num=10,sum=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			{
				sum=sum+start;
				System.out.println(start);
			}				
		}
		System.out.println("sum is"+ sum);
	
	}
}