class ThrowsDemo1
{

public static void main(String[]args) throws InterruptedException

{
doStuff();

}
public void doStuff()
{
 doMoreStuff();
}
public void doMoreStuff()
{
   System.out.println("HELLO");
}


}

}