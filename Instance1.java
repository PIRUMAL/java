class Instance1
{
	int i=10;
	{
		m1();
		System.out.println("first instance block ");
	}
	
	Instance1 ()
	{
		System.out.println(" first Constructor");
	}
	
	
	public static void main(String[] args)
	{
	Instance1 t =new Instance1 ();
		System.out.println(" 1st main method  ");
	}
	
	
	public void m1()
	{
		System.out.println(j);
		
	}
	
	
	{
		System.out.println("Second Instance  block");
	}
		int j=20;
}


class Child extends Instance 
{
	 int P=100;
	 {
		 m2();
		 
		 {
			 System.out.println(" Third   Instance  block");
		 }
		 
	Instance2 ();
		
		{
			System.out.println("Second constructor ");
		}
		
		public static void main(String[] args)
		{
		Instance2 t =new Instance2();
			System.out.println(" Second main method  ");
		}
		public void m2();
		{
			System.out.println(Q);
			
		}
		{
			System.out.println("Second Instance  block");
		}
			int Q=200;
	 
	 
		
	 }
}



