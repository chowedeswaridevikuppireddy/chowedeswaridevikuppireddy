class ProfitLoss2
{
	public static void main(String[] args)
{
	int cp=500,sp=800;
	double Profit,Loss;
	String s=(cp>=sp)?"Loss":(cp<=sp)?"Profit":"Invalid";
	System.out.println(s);
}
}