public class Test26{
public static void main(String args[])
{
	char grade='D';
	switch(grade)
	{
		case'A':
		System.out.println("Excellent");
		break;
		
		case'B':
		System.out.println("Welldone");
		break;
		
		
		case'D':
		System.out.println("you passed");
	
		break;
		
		default:
		System.out.println("invalid");
			
	}
	System.out.println("your grade is :" +grade);	
}

}
