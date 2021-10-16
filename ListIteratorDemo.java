package JavaPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList l=new LinkedList();
  l.add("Kamal");
  l.add("Raj");
  l.add("Devi");
  l.add("Chinna");
  l.add("Satish");
  System.out.println(l);
  
  ListIterator ltr=l.listIterator();
  
  while(ltr.hasNext())
  {
	  String s =(String)ltr.next();
  }
 
if(s.equals("venki"))
  {
	  ltr.remove();
  }
  else if(s.equals("Satish"))
  {
	  ltr.add("Madhu");
  }
  
  else if(s.equals("Chinna"))
  {
	  ltr.add("Mou");
  }
  
  System.out.println(ltr);
  
  
  
	}

}
