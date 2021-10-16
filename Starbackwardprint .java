
class Starbackwardprint 
{
public static void main (String[]args)
{

int n=5;

for (int i=n;i>=n;i--)
{

   for(int j=n-1;j>=i;j--)
   {
     System.out.println(" ");
    }
    for(int k=i;k>=1;k--)
    {
    System.out.println("*");
}

System.out.print("\n");

}




}

}
}