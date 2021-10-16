class A
{
	
	public void m1()
	{
		System.out.println(" I am in parent class");
		
	}
}
class  B extends A
{
	public void m2()
	{
		System.out.println(" I am in subparent class");	
	}
}
class C extends B
{
	public void m3()
	{
		System.out.println(" I am in Child class");	
	}
}


public class OverriddingTypeCastDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 C c=new C();
    c.m1();
	c.m2();
	c.m3();
	//((B)c).m1();
	//((A)((B)c)).m1();
 
		
	}

}
