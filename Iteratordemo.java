import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Iteratordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l=new ArrayList();
		 for ( int i=0;i<=3;i++)
		 {		
		  l.add ( i); 
		 }
		System.out.println (l);
		 Iterator itr=l.iterator();
while(itr.hasNext())
{
Integer I =(Integer) itr.next();
 if (I%2==0)
 {
	 System.out.println (I); 
 }
 else 
	 itr.remove();
	 
}
System.out.print(l);

	}
}
