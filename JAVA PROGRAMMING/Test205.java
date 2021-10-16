
class Test205
{
Test(int i)
{ System.out.println("no-argument constructor");
}
public static void main(String args[])throws Exception
{
Object o =Class.forName(args[0]).newInstance();
System.out.println("object created for:"+o.getClass().getName());

}

}