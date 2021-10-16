class A
{
public void marry()
{
System.out.println("I am a child lover");
}
}
class B extends A
{
public void marry()
{
System.out.println("I love you");
}
}

class C
{
public static void main(String[] args)
{
A a=new A();
a.marry();

B b =new B();
b.marry();
}
}
