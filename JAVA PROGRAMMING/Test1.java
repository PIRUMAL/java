public class Test1{
public static void main(String args[])
{
double[] mylist={1.9,2.9,3.4,3.5};
for (int i=0;i<mylist.length;i++)
{
System.out.println(mylist[i]);

}

double total=0;
for(int i=0;i<mylist.length;i++)
{
	total+=mylist[i];

System.out.println("Total is"+ total);
}
}

}