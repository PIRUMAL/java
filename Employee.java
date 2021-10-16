class Employeestaticdemo2
{
int employeeid ;
String name ;
static String company="HCL" ;

Employeestaticdemo2( int employeeid,String name)
{
this.employeeid=employeeid;
this.name=name;
}

public void display()
{
System.out.println (employeeid+ " "+name+ " "+company + " "); 
} 

public static void main (String [] args)
{
Employeestaticdemo2 e1=new Employeestaticdemo2(101,"amit");
Employeestaticdemo2 e2=new Employeestaticdemo2(102,"Gopal");
Employeestaticdemo2 e3=new Employeestaticdemo2(103,"Subrata");
e1.display();
e2.display ();
e3.display();
}
}









