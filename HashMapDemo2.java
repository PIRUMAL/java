import java.util.*;
class HashMapDemo2
{
public static void main (String [] args )
{
HashMap m=new HashMap();
m.put("Durga",700);
m.put ("Shiva",800);
System.out.println(m);
System.out.println(m.put("Durga",1000));
System.out.println(m);
Set s=m.keySet();
System.out.println(s);


Set s1=m.entryset();
System.out.println(s1);


}
}
