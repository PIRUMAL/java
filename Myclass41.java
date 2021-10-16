class Myclass41
{
int i =100;
public static void main (String [] args)
{
System.out.println(" In main");
Myclass41 mc=new Myclass41();
 System.out.println(mc.i);
mc.i=300;
 System.out.println(mc.i);
Myclass41 m=new Myclass41();
System.out.println(m.i);
System.out.println(m);
System.out.println(mc);
}
}