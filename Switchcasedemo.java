class Switchcasedemo
{


final static int a=2;
public static int b=0;
public static void main (String [] args)
{
for ( int c=0;c<3;c++)
{
switch (c)
{

case a: System.out.println("1");
case a-1:System.out.println("2");
default:System.out.println("0");
}
}
}
}