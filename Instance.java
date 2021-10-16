class Instance
{
	int i=10;
	{
		m1();
		System.out.println("first instance block ");
	}
	
	Instance ()
	{
		System.out.println("Constructor");
	}
	
	
	public static void main(String[] args)
	{
	Instance t =new Instance ();
		System.out.println("main ");
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
