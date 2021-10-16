class This
{
int x=200;
This(x)
{
this.x=x;
}

}
public static void main (String[] args)
{
This t=new This ();
System.out.println(this.x);
}
} 