class A
{
 public void m1()
{
System.out.println("I am in parent class");
}
}

class FinalDemo2 extends A
{
public void m1()
{
System.out.println("I am in child class");
}

public static void main(String args [])
{
FinalDemo2 fd=new FinalDemo2();
}
}


