class Evensquare
{
	public static void main(String[] args)
	{
		int num=64;
		double d=Math.sqrt(num);
		if((int)d==d && num%2==0)
			System.out.println(num + "is even perfect square");
		else
			System.out.println("not a even perfect square");
	}
}