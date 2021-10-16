class Test
{
int x;
public void setValues (int x ) 
{
this.x=x;
}
public void show ()
{
System.out.println(x);

}
}
class Thiskeyword
{
public static void main (String[] args)
{
Test t=new Test();
t.setValues(100);
t.show();

}
}
 