class Main
{
	public static void main(String[] args)
	{
		int num1=8,num2=6,end1=num1,end2=num2,count1=0,count2=0;
		for(int start1=1;start1<=end1;start1++)
		{
			if(num1%start1==0)
				count1++;
		}
		for(int start2=1;start2<=end2;start2++)
		{
			if(num2%start2==0)
				count2++;
		}
		if(count1==2 && count2==2)
			System.out.println("Twisted prime");
		else
			System.out.println("not Twisted prime");
	}	


}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    