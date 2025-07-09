class ProfitLoss
{
	public static void main(String[] args)
{
	int cp=500,sp=300;
	double Loss,Profit,Profitper,Lossper;
	if(cp>=sp)
		{
		Loss=cp-sp;
	        Lossper=(Loss/cp)*100;
		System.out.println(Loss);
		System.out.println("Loss is :"+Lossper);
		}
	else
		{
		 Profit=sp-cp;
		 Profitper=(Profit/cp)*100;
		System.out.println(Profit);
		System.out.println("Profit is :"+Profitper);
		}

}
}