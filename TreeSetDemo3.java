import java.util.*;
class TreeSetDemo3
{
public static void main (String []args)
{
TreeSet t =new TreeSet(new MyComparator());
t.add("R");
t.add ("S");
t.add ("D");
t.add ("P");
t.add ("K");
System.out.println(t);
}
}

class MyComparator implements Comparator 
{
public int compare (Object obj1,Object obj2)
{
String S1 =obj1.toString();
String S2 =obj2.toString();
return -S2.compareTo(S1);
}
}
