import java.util.scanner;
class Main12
{
	public static void main(string args[])
	{
		Scanner sc=new Scanner();
		System.out.println("enter employee id");
		int num=sc.nextInt();

		System.out.println("enter employee name");
		String name=sc.next();

		System.out.println("enter employee email");
		String email=sc.next();

		System.out.println("employee phone number");
		long phno=sc.nextlong();

		System.out.println("enter employee dptname");
		String dpt=sc.next();

		System.out.println("enter salary");
		long salary=sc.nextlong();

		Employee emp=new Employee(num,name,email,phno,dpt,salary);
		
            int val=emp.calPf(salary);

		System.out.println("pf is "+ val);
		int val2=emp.calTax(salary,0,0);
		System.out.println("Anual salary is"+ val2);
		int val3=emp.basic(Asal,0);
		System.out.println("tax is: "+ val3);
		int val4=emp.luxury(Asal);
		System.out.println("luxury is: "+ val4);
		int val5=emp.calEmi(Asal);
		System.out.println("Emi is: "+ val5);
		int val6=emp.calorp(Asal);
		System.out.println("orphan is: "+ val6);
		int val7=emp.calSav(Asal,val,val2,val3,val4,val5,val6);
		System.out.println("savings is: "+ val7);

		}
}
 class Employee
{
	int e_id;
	String e_name;
	String e_mail;
	long e_phno;
	String e_dpt;
	long e_salary;
}
	int calPf(int res)
		{
			res=(10/100)*salary;
			if(res<=10000)
				System.out.println("10% of pf is "+ res );
			else
				System.out.println("10000");
			return res;
		}
	int calTax(int salary,int tax,int Asal)
		{
			int Asal=salary*12;
			if(Asal<=500000)
				tax=(Asal/5)*100;
				return tax;
			else if(Asal<=100000)
				tax=(Asal/10)*100;
				return tax;
			else if(Asal<=150000)
				tax=(Asal/15)*100;
				return tax;
			else if(Asal<=3000000)
				tax=(Asal/20)*100;
				return tax;			
			else if(Asal>=3000000)
				tax=(Asal/35)*100;
				return tax;
		}
	int basic(int Asal)
		{
		basic=(Asal/30)*100;
		return basic;
		}
	int lux(int Asal)
		{
		luxury=(Asal/5)*100;
		return Luxury;
		}
	int calEmi(int Asal)
		{
		emi=(Asal/10.0)*100;
		return emi;
		}
	int calOrp(int Asal)
		{
		orp=(Asal/5.0)*100;
		return orp;
		}
	int calSav(int Asal,int val,int val2,int val3,int val4,int val5,int val6)
		{
			tot=val+val2+val3+val4+val5+val6;
			sav=Anual-tot;
			return sav;
		}	 

		
			
			

				
					
		
		

	