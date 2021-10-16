class Test
{
Test(Thiskeyword6 t)
{
System.out.println("test class constructor");
}
}
class Thiskeyword6
{
public void m1()
{
Test t=new Test(this);
}

public static void main (String[] args)
{
Thiskeyword6 t=new Thiskeyword6();
t.m1();
}
}

 