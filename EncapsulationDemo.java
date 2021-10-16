
class Company
{
private int EmployeeID;
	public void setm1(int empCode) 
	{
		EmployeeID=empCode;
	}
	
public int getm2()
{
	return EmployeeID;
	
}
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company e=new Company();
		e.setm1(500);
		System.out.println(e.getm2());
		
		 
		
	}

}
