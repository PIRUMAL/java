class A
{
int a=30;
}
class B extends A
{
int a=20;

public void  m1 (int a)

{
System.out.println (a);
System.out.println (super.a);
System.out.println (this.a);
}
}
class Superdemo
{
public static void main (String [] args)
{
B b=new B();
b.m1 (50);
}
}





 

