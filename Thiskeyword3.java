class Test
{
public void m1()
{
System.out.println(" i am in m2 method");
}

Public void m2()
{
m1();
}

}
class Thiskeyword4
{
public static void main (String[] args)
{
Test t=new Test();
t.m2();
}
}
 