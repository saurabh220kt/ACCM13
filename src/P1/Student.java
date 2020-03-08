package P1;

public class Student {

	int roll_no;
	String name;
	String branch;
	int m1,m2,m3,p;
	
	Student(int r,String n,String b,int m1,int m2,int m3)
	{
		roll_no=r;
		name=n;
		branch=b;
		p=(m1+m2+m3)/3;
	}
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Saloni","CS",75,82,81);
		Student s2=new Student(102,"Raju","CS",35,35,42);
		System.out.println("the student result is\n"+s2.toString());
		System.out.println("The student percentage is"+s2.hashCode());
//		
		
		System.out.println(s1.equals(s2));
		
	}
	
	
	
	@Override
	public boolean equals(Object obj)
	{
		Student s=(Student) obj;
		
		return branch==s.branch;
	}
	
	@Override
	public int hashCode()
	{
		//returning the percentage of the student
		
		return p;
	}
	@Override
	public String toString()
	{
		if(p>=75)
			return "Distinction";
		else if(p>=60 && p<75)
			return "first class";
		else if(p>=35 && p<60)
			return "Pass";
			else
				return "fail";		

	}
}
