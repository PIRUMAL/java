class Sample1
{
Sample1()
{
System.out.println("Sample1");
 
}
}
class Sample2 extends Sample1
{
Sample2()
{
System.out.println("Sample2");
}
}
class Sample1Inheritancedemo 
{
public static void main (String [] args )
{
Sample2 s=new Sample2(); 
}
}