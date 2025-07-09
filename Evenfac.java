class Evenfac
{
	public static void main(String[] args)
	{
		int end=12,num=12,count=0,count1=0;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			{
				if(start%2==0)
				System.out.println("even Factors are "+start);
				count++;
			}

		}
	}
			System.out.println(count);
			System.out.println("count for odd facots");
			for(int start=1;start<=end;start++)
			{
				if(num%start==0)
				{
					if(start%2!=0)
					System.out.println("odd Factors are "+start);
					count1++;
				}
			}
					System.out.println(count1);
	}
