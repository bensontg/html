package benson;
//constructor
public class School 
{
	
String name;
int rollno;
 public School(String name,int rollno)
 {
	 this.name=name;   //initializing object speccific values
	 this.rollno=rollno; //this is refers current object.
 }
 public void study()
 {
	 System.out.println(name);
	 System.out.println(rollno);
 }
 public void play()
 {
	 System.out.println(name);
	 System.out.println(rollno); 
 }
	public static void main(String[] args) 
	{
		String s="ben";
		int d =456*2;
		School student=new School(s,d);
	School student2=new School("raj",125);
      student.study();
      student2.play();
	}

}
