class Myclass46 
{
Myclass46 (String s)
{
System.out.println("Parameter Constructor");
System.out.println(s);
}
public static void main ( String[] args ) 
{
Myclass46 mc= new Myclass46("java");
Demo d = new Demo (10);
}
}
class Demo 
{
Demo( int i)
{
System.out.println(" Int type Parameter Constructor ");
System.out.println(i);

}
}
