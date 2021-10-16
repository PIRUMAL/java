 class  FinalDemo
{
public void m1()
{
System.out.println(" Hello world");
}
}
class Piru extends FinalDemo
{
public void m2()
{
System.out.println(" Hello world");
}
}

 class FinalDemosession
{
public static void main ( String [] args)
{
Piru S= new Piru();
S.m2();
S.m1();
}
}

