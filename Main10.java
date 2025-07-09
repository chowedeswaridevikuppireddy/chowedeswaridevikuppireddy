class Main10
{
	public static void main(String args[])
	{
		Product product1=new Product();
		product1.name="chips";product1.quantity=5;
		product1.price=30;
		int total=product1.proTotal();
		int discount=product1.disProduct(total);
	       System.out.println(product1.totFinal(discount,total));
		
	
	}
}
 
class Product
{
	String name;
	double price;
	int quantity ;
	int proTotal()
	{
		return (int)(quantity*price);
	
	}
	int disProduct(int total)
	{
		return (int)((10.0/100)*total);
	}
	int totFinal(int discount,int total)
	{
		return total-discount;
	}
}
