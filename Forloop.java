import java .util.Scanner;
import java.text.*;

public class Calculatordemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	            int Principal=0;
	            int years=0;
	        	 float annual_interest_rate=0;
	            int numberOfpayments=0;
	            float monthly_interest=0;
				byte month_in_year=12;
				byte parcent=100;
				Scanner scanner=new Scanner(System.in);
				while(true)
				{
					System.out.println("Principal:");
					 Principal=scanner.nextInt();
					if (Principal>=1_000 && Principal<=30_000)
					break;
					System.out.println("Enter  value between 1_000 to 30_000");
					
				}

				while(true) {
				System.out.print("Annual interest rate ");
				annual_interest_rate =scanner.nextInt();
				if (annual_interest_rate>=1 && annual_interest_rate<=30) {
					monthly_interest=annual_interest_rate/parcent/month_in_year;
					break;
				}
					System.out.println("Enter  value between 1 to 30");
				
				}	 
				
			
	   
				 while (true)
				 {
				 
				System.out.print("period:(years)");
				years=scanner.nextByte();
				if (years>=1 && years<=30) {
					numberOfpayments=years*month_in_year;
				break;
				 }
					System.out.println("Enter  value between 1 to 30");
				 }


				double interest_amount=Principal*(monthly_interest*Math.pow(1+monthly_interest,numberOfpayments))/(Math.pow(1+monthly_interest,numberOfpayments) -1);

				String Format=NumberFormat.getIntegerInstance().format(interest_amount);
				
				System.out.print("interest_amount:" +Format);
				
				//String Format=NumberFormat.getCurrencyInstance().format(interest_amount);
				//System.out.print("interest_amount:" +Format);
	}
	}			
	