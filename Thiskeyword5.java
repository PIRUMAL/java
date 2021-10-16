class Test
{
Test(Thiskeyword t1)
{
System.out.println("test class constructor");
}
}
class Thiskeyword
{
public void m1()
{
Test t=new Test(this);
}

public static void main (String[] args)
{
Thiskeyword t=new Thiskeyword();
t.m1();
}
}

 