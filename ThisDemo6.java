class ThisDemo
{
String name,email,psw;
long phonenumber;
ThisDemo(String name,String email,String psw)
{
this.name=name;
this.email=email;
this.psw=psw;
}
ThisDemo(String name,String email,String psw,long phonenumber)
{
this.name=name;
this.email=email;
this.psw=psw;
this.phonenumber=phonenumber;
}
}
class ThisDemo6
{
public static void main ( String[] args)
{
ThisDemo t= new ThisDemo("RAJ","piru@gmail.com","@#$123456");
System.out.println(t.name+ ","+ t.email+","+ t.psw);

ThisDemo t2= new ThisDemo("Suit","pirumal24@gmail.com","@#$123456",7892456);
System.out.println(t2.name+ ","+   t2.email+","+ t2.psw+","+ t2.phonenumber);
}
}