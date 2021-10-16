class Object
{
public boolean equals ( Object obj)
{
return(this==obj);
}
}
class String extends Object
{
public boolean equals ( Object obj)
{
}

}
class Stringequalsmethod
{
public static void main (String[] args )
{

String s1=new String("Deepak");
String s2=new String("Deep");
System.out.println(s1.equals(s2));
}
}