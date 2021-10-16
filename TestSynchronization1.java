class Test {
public void printable( int n)
{
for ( int i=0; i<=5;i++)
{
System.out.println(n*i);

try
{
Thread.sleep(400);
}
catch(Exception e){
	System.out.println(e);
}
	
}

}
}
class MyThread6 extends Thread
{
Test t;
MyThread6 (Test t)
{
 this.t=t;
}
public void run (){

t.printable (200);
}

}
class MultiplicationDemmo
{
public static void main (String args [])
{
Test obj=new Test ();
MyThread6 t1=new MyThread6(obj);
}
}


