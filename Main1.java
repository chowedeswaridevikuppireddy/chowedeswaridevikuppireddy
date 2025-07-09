class Main
{
	public static void main(String args[])
	{
		int arr[]=new int[]{67,98,63,9876};
		System.out.println("The length of array is"+arr.length);
		System.out.println("Size of array is "+ (arr.length-1));
		int x,y;
		System.out.println("first half");
		for(x=(arr.length-1)/2;x>=0;x--)
		{
			System.out.print(arr[x]+" ");
		}
		for(y=((arr.length-1)/2)+1;y<=arr.length-1;y++)
		{
			System.out.print(arr[y]+" ");
		}
		System.out.println("second half");
		for(x=0;x<=(arr.length-1)/2;x++)
			System.out.print(arr[x]+" ");
		for(y=arr.length-1;y>=((arr.length-1)/2)+1;y--)
			System.out.print(arr[y]+" ");
		

	}
			
}


//String s[]=new String[]{'a','b','c'};
	//System.out.println("The length of array is"+s.length);