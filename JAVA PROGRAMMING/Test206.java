class Test206 
{
public static void main(String args[]) throws Exception
{
Thread t = new Thread();
System.out.println(Class.forName(args[0]).isInstance(t));
}

}