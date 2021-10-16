import java.util.Scanner;
class Evenandodddemo
{
public static void main( String [] args)
{

Scanner reader =new Scanner(System.in);
System.out.println("Enter a number");

int num=reader.nextInt();

if(num%2==0)
System.out.println(num +"num is even");

else
System.out.println(num +"num is odd");



}
}