class Array1
{
	public static void main (String args[])
	{
		int arr[]={10,20,30,40,50,60,70,80,90,100};
		int[] b=new int[arr.length];
		int x;
		for(x=0;x<arr.length;x++)
		{
			b[x]=arr[x];
		}
			for(x=0;x<b.length;x++)
			{ 
				System.out.println("the elemts in b array is "+ b[x] +" ");
			}
	}
				

}