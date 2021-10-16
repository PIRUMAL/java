class M1 
{
M1 (String s)
{
System.out.println("Parameter Constructor");
System.out.println(s);
}
public static void main ( String[] args ) 
{
M1 mc= new M1("java");
//Demo d=new Demo();
}

}
class Demo 
{
Demo(int i)
{
System.out.println(" Int type Parameter Constructor ");
System.out.println(i);

}
}
