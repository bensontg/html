package benson;

public class Library {
	static String libraryName="ram";
	String readerName="senthil";
	int age;

	public static void main(String[] args)
	{
	Library reader=new Library();
	Library reader1=new Library();
	int s=100;
	reader.add(s);
	reader1.sub(s);
	//System.out.println(libraryName);
	System.out.println(reader.readerName);
	

	}
public void add(int s)
{
	//System.out.println(s);
	System.out.println(readerName);
}
public void sub(int s)
{
	//int b; local variable must aayitt initialize cheyyanum cheyyathe variable name maathram print cheythaal error varum
	libraryName="sethu";
	readerName="kannan";
	s=99;
	System.out.println(readerName);
	//System.out.println(libraryName);
	//System.out.println(b);
}
}
