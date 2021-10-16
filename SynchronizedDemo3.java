class Display
{
synchronized (this)
{
	for ( int i=0;i<3;i++)
	{
		System.out.println("Good Morning ");
		
		try
		{
			 Thread.sleep(1000);
		}
		
		catch(InterruptedException e)
		{
			
			
		}
		
		System.out.println(name);
		
	}
}
}

class MyThread extends Thread
{
	 Display d;
	 String name ;
	 MyThread (Display d,String name ) 
	 {
		  this .d=d;
		   this. name=name ;
		   
	 }


	
	 public void run ()
	 {
		 d.wish(name);
                 
	 }
}


public class SynchronizedDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Display d=new Display();
     
	MyThread t1=new MyThread(d,"dhoni");
	MyThread t2=new MyThread(d,"YUVRAJ");
	
	t1.start();	
	t2.start();
		
		
		
	}

}
