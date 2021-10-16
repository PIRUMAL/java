class I
{
public void m1()
{
System.out.println("parent class ");
}
}

class P extends I 
{
public void m2()
{
System.out.println("child class ");
}
}

class Inheritancedemo
{
public static void main (String[]args)
{
I i=new I ();
i.m1();

P p=new P();
p.m2();


P p =new I ();
p.m2();

}
}

