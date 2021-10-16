import java.util.*;
class TreeSetDemo2
{
public static void main (String []args)
{
TreeSet t =new TreeSet();
t.add("Raja");
t.add ("Rani");
t.add ("Durga");
t.add ("Piru");
t.add ("Kalyan");
System.out.println(t);
}
}

class MyComparator implements Comparator 
{
public int compare (Object obj1,Object obj2)
{
String S1 =obj1 to String();
String S2 =(String)obj2;
return S2 compareTo(s1);
}
}
