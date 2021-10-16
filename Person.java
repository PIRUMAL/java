
public abstract class Person {
	{
	String Name;
	int age;
	}
	Class Student extends Person
	{
	int rollno;
	int marks;
	Student (String Name,int age,int rollno,int marks)
	{
		this.Name =Name;
		this.age=age;
		this.rollno=rollno;
		this.marks=marks;
	}

	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Student s =new Student("durga",48,101,90);
		
	}

}	

}
