class Age2
{
	public static void main(String[] args)
	{
		int age=9;
		String occupation="private",gender="female";
		if(age>=60 && age<=100)
		{
			if(gender=="female")
			{
				System.out.println("provide a pension of 5000");
			}
			else
			{
				System.out.println("provide a pension of 3000");
			}
		}
			else if(age>=18 && age<60)
				{
					if(occupation=="govt")
						{	
							System.out.println("provide health insurence to the entire family");
						}
						else if(occupation=="private")
						{
							System.out.println("provide health insurence to that person");
						}
						else
					        {
							System.out.println("no health insurence");
						}
				}
					  else if(age>=0 && age<18)
						{
							if(age<10)
							{
								System.out.println("provide the free medical");
							}
							else
							{
								System.out.println("provide scholarship");
							}
						}
					
	}
}