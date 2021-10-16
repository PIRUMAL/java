class Myclass43
{
static int i=100;
static char ch='A';
public static void display()
{
System.out.println("In Display()");

System.out.println(i);
System.out.println(ch);

}



public static void main (String[] args)
{
 display();
Student s=new Student();
s.writeExam();
}

}
class Student
{
static int stdId=491;
static String stdName="Nikki";
public void writeExam()
{

System.out.println(stdId);

System.out.println(stdName);
}
}




