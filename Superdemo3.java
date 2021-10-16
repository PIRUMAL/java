class A
{
 A()
{
System.out.println("I am in parent class");
}

}
class Superdemo3 extends A
{
Superdemo3()
{
super();
System.out.println("I am in child class");
}

public static void main (String[] args)
{
Superdemo3 sp=new Superdemo3();


}
}