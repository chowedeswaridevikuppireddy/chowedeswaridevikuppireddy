class Grade
{
	public static void main(String[] args)
	{
		int tel=9,hin=9,eng=96,mat=9,sci=9,soc=100;
		double total=tel+hin+eng+mat+sci+soc;
		double Maxmarks=600;
		double per=(total/Maxmarks)*100;
		System.out.println(per);
		String s=(per>=90)?"Grade-A":(per>=80)?"Grade-B":(per>=70)?"Grade-c":(per>=60)?"Grade-D":"grade-E(fail)";
		System.out.println(s);
	}
}
