class Roman1
{
	public static void main(String[] args)
	{
		int num=9;
		String s=(num==1)?"I":(num==2)?"II":(num==3)?"III":(num==4)?"IV":(num==5)?"V":(num==6)?"VI":(num==7)?"VII":(num==8)?"VIII":(num==9)?"IX":"X";
		System.out.println(s);
	}
}
