class Count1
{
	public static void main(String[] args)
	{
		int end=10,num=10,count=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			{
				count++;
				System.out.println(start);
			}				
		}
		System.out.println("count is"+ count);
	
	}
}