
class Star3
{
public static void main (String[]args)
{

int n=5;
int star=1;
int space=n-1;

for (int i=1;i<n;i++)
{

for(int j=space;j>i;j--)
{
System.out.println("******");

for(int k=1;k<space;k--)
{
System.out.println(" ");

}

space-=2;




}

}
}
}