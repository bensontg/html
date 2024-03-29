package benson;

public class Bank 
{	
public static void main(String[]args)	
{	
Bank cashier = new Bank();	
cashier.deposit();	// Method Calling Statement
cashier.withdraw();
}
void deposit()      //Method name: deposit
{
System.out.println("depositing"); 	
}	
void withdraw()	
{
System.out.println("withdraw");
}
}