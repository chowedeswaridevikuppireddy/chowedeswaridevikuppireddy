class Facpro
{
	public static void main(String[] args)
	{
		int end=10,num=10,pro=1;
		for(int start=1;start<=end;start++)
		{
			if(num%start==0)
			{
				pro=pro*start;
				System.out.println(start);
			}				
		}
		System.out.println("pro is"+ pro);
	
	}
}