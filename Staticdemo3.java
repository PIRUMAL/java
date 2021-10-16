class Staticdemo3
{
 static int count =15;
Staticdemo3()
{
count++;
System.out.println(count);
}
public static void main (String [] args )
{
Staticdemo3 c1 =new Staticdemo3();
Staticdemo3 c2 =new Staticdemo3();
Staticdemo3 c3=new Staticdemo3 ();

}
}