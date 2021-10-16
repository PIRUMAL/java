class TestIsInstance method
{
public static void main(String args[]) throws Exception
{
Thred t = new Thread();
System.out.println(Class.forName(args[0]).isInstance(t));
}

}