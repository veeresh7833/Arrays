import java.util.*;
class Student
{
	int id;
	double cgpa;
	Student(int id,double cgpa)
	{
		this.id=id;
		this.cgpa=cgpa;
	}
}
public class Arrayobj {
  public static void main(String [] args)
  {
	 //Student st=new Student(101,8.4);
	 //System.out.println(st.id+"  "+st.cgpa);
	  Student[] s=new Student[5];
	  s[0]=new Student(101,50.2);
	  s[1]=new Student(190,5.2);
	  s[2]=new Student(109,40.2);
	  s[3]=new Student(110,54.2);
	  s[4]=new Student(121,50.2);
	  for(int i=0;i<5;i++)
	  {
		  System.out.println(s[i].id+"  "+s[i].cgpa);
	  }
}
}
