
class Star10
{
public static void main (String[]args)
{

int n=5;
int star=1;
int space=n-1;

for (int i=0;i<n;i++)
{

for(int j=space;j>i;j--)
{
System.out.print(" ");

}
for(int k=0;k<star;k++)
{
System.out.print("*");
}
star+=2;
System.out.println();
}

for ( int l=1;l<=4;l++)
{

for(int m=1;m<=l;m++)
{
System.out.print(" ");
}

for(int p=4;p>=l;p--)
{
System.out.print("*");
}
for(int o=3;o>=l;o--)
{
System.out.print("*");
}

System.out.println();
}
}
}
