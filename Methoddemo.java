class Methoddemo
{
static  void  m1()
{

System.out.println("I am in m1()method");
return;
}
static int  m2()
{

System.out.println("I am in m2() method");
return 22;
}
static
{

System.out.println("I am in Static Block");

}
public static void main (String[]args)
{

System.out.println("I am in main method");
m1();
System.out.println(m2()) ;
}
}
