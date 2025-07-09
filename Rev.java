class Rev
{
	public static void main(String[] args)
	{
		int end=1,table=7,res;
		for(int start=10;start>=1;start--)
		{
			res=table*start;
			if(res%2==0 && res%4==0)
			System.out.println(table +" * " +start +" = " + res);
		}
	}[

}