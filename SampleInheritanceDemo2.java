class SampleInheritanceDemo2
{
SampleInheritanceDemo2()
{
this (" Dabba fellow");
System.out.println("Non parameterised constructor");
}
SampleInheritanceDemo2 (int x)
{
System.out.println("int type");
System.out.println(x);
}
SampleInheritanceDemo2 ( String name)
{
this (10);
System.out.println("String type");
System.out.println(name);
}
public static void main ( String[] args)
{
SampleInheritanceDemo2 s = new SampleInheritanceDemo2();
}
}