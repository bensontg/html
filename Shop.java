package benson;
//Constructor overloading
public class Shop
{
static String owner;
String brand;
int price,value;
public Shop(String brand,int price)
{
	this.brand=brand;
	this.price=price;
}
public Shop(String brand,int price,int value)
{
	this.brand=brand;
	this.price=price;
	this.value=value;
}
public Shop()
{
System.out.println("Zero argument constructor");
}
public void money()
{
	System.out.println(brand);
	System.out.println(price);
	System.out.println(value);
}
	public static void main(String[] args)
	{
		Shop prod1=new Shop("abc",10);
		Shop prod2=new Shop("abcd",20);
		Shop prod3=new Shop("abcd",20,60);
		Shop prod4=new Shop();
		prod1.money();
		prod2.money();
		prod3.money();
		prod4.money();
		

	}

}
