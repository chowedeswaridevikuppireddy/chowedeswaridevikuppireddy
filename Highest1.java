class Highest1
{
	public static void main(String[] args)
	{
		int end=100,num=100,highest=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			{
				highest=start;
				System.out.println(start);
			}				
		}
		System.out.println("highest is" + highest);
	
	}
}