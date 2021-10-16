import java.util.Scanner;
class If 
{
public static void main (String[] args)
{

Scanner sc =new Scanner (System.in);
System.out.println ("Enter the number:");

int Number=sc.nextInt();

if(Number>0)
{
System.out.println("The number is Positive");
}
else if (Number<0)
{
System.out.println("The number is Negative ");
}
else 
{
System.out.println("The number is neither  Positive nor negative ");
}
}
}
