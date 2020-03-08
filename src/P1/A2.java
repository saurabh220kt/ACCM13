-package P1;

public class A2 {

	int id;
	A2(int id)
	{
		this.id=id;
	}
	public static void main(String[] args) {
		
		
		A2 student1=new A2(10);
		A2 student2=new A2(10);
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1==student2);
		
		System.out.println(student1.test(student2));
		
	}
	
	
	public boolean test(A2 obj)
	{
		if(id==obj.id)
			return true;
		else
			return false;
	}
	
	
}
