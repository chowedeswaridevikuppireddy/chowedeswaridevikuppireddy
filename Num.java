class Num
{
	public static void main (String[] args)
	{
		int end=16,num=end,count=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			count++;
		}
			System.out.println(count);
			if(count==5)
			System.out.println("super number");
	}
}