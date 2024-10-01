package in.basics;

public class Exercise2 {
	public void m1() {
		 System.out.println("hello");
		 m2();
	 }
	 public void m2() {
		
		 System.out.println("hii");
		 m1();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 obj=new Exercise2();
		obj.m2();
	}

}
