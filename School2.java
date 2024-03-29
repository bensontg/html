package benson;

public class School2 
{ 
	int m1,m2,m3,m4,m5,m6;
	intl1,l2,l3;
	public School2(int m1,int m2,int m3, int m4, int m5, int m6)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.m6=m6;
	}
	public void disp()
	{
		System.out.println(m1+""+m2+""+""+m3+""+m4+""+m5+""+m6);
	}

	public static void main(String[] args)
	{
	School2 csestudent=new School2(70,71,72,73,74,75);
	School2 biostudent=new School2(80,81,82,83,84,85);
	School2 accstudent=new School2(90,91,92,93,94,95);
	School2 hisstudent=new School2(60,61,62,63,64,65);
	csestudent.disp();

	}

}
