class M
{
int i=10;
public void printValue()
{
System.out.println( "a-value");
}
} 
class N extends M 

{
int i=12;
public void printValue()
{
System.out.println("b-value"); 
}
}
class Metodoverloadingdemo
{
public static void main (String args[])
{
 M a= new N ();
a.printValue();
System.out.println(a.i);
 

}
}