class MyThread extends Thread
{
	public void run()
	
	
	{
		for(int i=0;i<10;i++)
			System.out.println(" Child Thread");		
			
	}
	
	public void run(int i)
	{
		System.out.println("  I am in 2nd Child Thread");
	
	}	
	
}


public class MultithreaddemoOverloadedRunmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t= new MyThread(); 
		t.start();
		t.run();
		System.out.println("Main Thread");
		
		
		
		

	}

}

