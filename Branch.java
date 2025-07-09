class Branch
{
	public static void main(String[] args)
	{
		String branch="MECH";
		double scholarship=0,fee=0;
		System.out.println("college Name :" + "JNTUA");
		if(branch=="CSE")
		{
			System.out.println("computer science and enginerring");
			System.out.println("c-programming\n" + "python\n" + "os\n" + "co\n");
			scholarship=15000;
			fee=50000;
		}
		else if(branch=="ECE")
		{
			System.out.println("Electrical and communication enginerring");
			System.out.println("LDKA\n" + "pcmc\n" + "electronic devices\n" + " communication system\n");
			 scholarship=5000;
			 fee=40000;

		}
   		else if(branch=="MECH")
		{
                        System.out.println("Mechanical enginerring");
			System.out.println("drawing\n" + "physics\n" + "electronic devices\n" + " communication system\n");
                         scholarship=10000;
			 fee=30000;

		}
		System.out.println("scholorship is    " + scholarship);
		System.out.println("fee is :" + fee);
        }
}