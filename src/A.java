
public class A {
	static int i=test();
	
	static int test() {
		System.out.println("From test method");
		int j=50;
		int k=90;
		return j+k;
	}
	public static void main(String[] args) {
		System.out.println("From main method");
		int k=test();
		System.out.println(test());
		System.out.println(k);
		System.out.println(i);
		
	}

}
