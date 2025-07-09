class Array1
{
	public static void main (String args[])
	{
		int arr[]={1,2,3,4,5,6};
		int[] b=new int[arr.length];
		int x;
		for(x=0;x<arr.length;x++)
		{	
			if(arr[x]%2==0)
				b[x]=arr[x];
		}
			for(x=0;x<b.length;x++)
			{ 
				System.out.println("the elemts in b array is "+ b[x] +" ");
			}
	}
				

}