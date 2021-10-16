class B
{
public void m2 ()
{
System.out.println(" I am in Super class");
}

}
class Superdemo2 extends B
{

public void m2 ()
{
System.out.println(" I am in childclass");
}

public void m1 ()
{
super.m2();
this.m2();
}

public static void main (String []args)
{
Superdemo2 b=new Superdemo2 ();
b.m1();

}


}

