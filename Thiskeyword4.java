class Test
{
public void m1(Test t)
{
System.out.println(" i am in m1 method");
}

public void m2()
{
m1(this);
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
 