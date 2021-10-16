import java .util.*;
import java.text.*;
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte month_in_year=12;
		byte parcent=100;
		Scanner scanner=new Scanner(System.in);
		System.out.print("Principal:" );
		int Principal=scanner.nextInt();
		System.out.print("Annual interest rate ");
		float annual_interest_rate =scanner.nextFloat();
		float monthly_interest=annual_interest_rate/parcent/month_in_year;
		System.out.print("period:(years)");
		byte years=scanner.nextByte();
		System.out.print("Annual interest rate ");
		int numberOfpayments=years*month_in_year;
		double interest_amount=Principal*(monthly_interest*Math.pow(1+monthly_interest,numberOfpayments))/(Math.pow(1+monthly_interest,numberOfpayments) -1);

		String Format=NumberFormat.getIntegerInstance().format(interest_amount);
		
		System.out.print("interest_amount:" +Format);
		
		//String Format=NumberFormat.getCurrencyInstance().format(interest_amount);
		//System.out.print("interest_amount:" +Format);
		
		
	}

}
