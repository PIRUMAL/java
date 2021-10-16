public class Staticdemo2
{
static
{
System.out.println("Static Block");
}
{
System.out.println("Static Block-2");
}
public Staticdemo2 ()
{
 
System.out.println ("Constructor");
}
 public static void main (String[] args)
{
Staticdemo2 a =new Staticdemo2();
}
}