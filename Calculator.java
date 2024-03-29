package benson;

public class Calculator {

	public static void main(String[] args)
	{
	Calculator calc=new Calculator();
	Calculator ca=new Calculator();
	calc.add(5,55);
	int s=ca.sub();
	calc.multiply(s);
	System.out.println(s);
	
//method callling statemnt(parameter,arguments)passing

	}
	public void add(int no1,int no2)
	{
		//no1=55;
		//no2=55;
		int c=no1+no2;
		System.out.println("Add"+c);
	}
	public int sub()
	{
		int a=20,b=90,c;
		c=b-a;
		return c;
	}
	public void multiply(int nu)
	{
		System.out.println(nu*2);
	}

}
