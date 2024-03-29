package benson;

public class Student 
{
String name;
int mark;
int rank;
public Student(String name,int mark)
{
	this.name=name;
	this.mark=mark;
	
}
public void study()
{
	System.out.println(name);
	System.out.println(mark);
	//System.out.println(rank);
}
public void play()
{
	System.out.println(name);
	System.out.println(mark);
	//System.out.println(rank);
}

	public static void main(String[] args) 
	{
	Student st=new Student("Rajan",1);
	Student st1=new Student("Rajesh",22);
	st.study();
	st1.play();
	//st1.play();



	}

}
