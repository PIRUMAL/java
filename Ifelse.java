import java.util.Scanner;
public class  Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.print("number:");
		int number=scanner.nextInt();
		
		if(number%5==0)
                { 
                 if(number%3==0)
		System.out.println("Fizz Buzz");
                else 
	         System.out.println("FIZZ");
                 }
             
		else if(number%3==0)
		System.out.println("Buzz");	
		else
			System.out.println(number);		
	}

}
