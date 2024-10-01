package in.basics;

public class Exercise {
 public void m1() {
	 System.out.println("hello");
 }
 public void m2() {
	 m2();
	 System.out.println("hii");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise obj=new Exercise();
		obj.m2();

	}

}
