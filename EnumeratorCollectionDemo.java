
package JavaPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java.util.*;
class EnumeratorCollectionDemo
{
public static void main (String [] args)
{
Vector v= new Vector();
for(int i=0;i<=5;i++)
{
v.addElement(i);
}
System.out.println(v);

Enumeration e =v.elements();

while (e.hasMoreElements())
{
	Integer I=(Integer)e.nextElement();
	
	if (I%2==0)
	{
		System.out.println(I);
		
	}
	
}
System.out.println(v);

}
}