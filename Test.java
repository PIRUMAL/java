class Test
{
public static void m1(int... y)
{
System.out.println("The number"+ y.length );

}
public static void main(String args[])
{
m1();
m1(10);
m1(10,20);
m1(10,20,30);
}






}