class Alphabet3
{	
	public static void main(String[] args)
	{
		char ch='A';
		if(ch>='A' && ch<='Z')
			System.out.println("capital letter");
		else if(ch>='a' && ch<='z')
			System.out.println("small letter");
		else if(ch==' ')
			System.out.println(ch +"is space");
		else if(ch>='0' && ch<='9')
			System.out.println(ch +"is digit");
		else
			System.out.println("Symbol");
	}
}