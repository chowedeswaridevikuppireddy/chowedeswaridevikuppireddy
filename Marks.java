class Marks
{
	public static void main(String[] args)
	{
		int tel=9,hin=9,eng=96,mat=9,sci=9,soc=100;
		double total=tel+hin+eng+mat+sci+soc;
		double Maxmarks=600;
		double per=(total/Maxmarks)*100;
		System.out.println(per);
		if(per>=90)
			System.out.println("grade-A");
		else if(per>=80)
			System.out.println("grade-B");
		else if(per>=70)
			System.out.println("grade-C");
		else if(per>=60)
			System.out.println("grade-D");
		else
			System.out.println("grade-E(Fail)");	

	}
}
