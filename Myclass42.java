class Myclass42
{
int i=100;
char ch='A';
public void display()
{
System.out.println("In Display()");

}
public static void main (String[] args)
{

System.out.println(new Myclass42().i);

System.out.println(new Myclass42().ch);

new Myclass42().display();

 int j=200;
char cd='B';
System.out.println(new Myclass42().j);

System.out.println(new Myclass42().cd);




}
}
