package in.basics;

public class Exercise1 {
	public void m1() {
		 System.out.println("hello");
	 }
	 public void m2() {
		
		 System.out.println("hii");
		 m1();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise1 obj=new Exercise1();
		obj.m2();
	}

}
