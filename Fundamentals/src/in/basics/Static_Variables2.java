package in.basics;

public class Static_Variables2 {
 static int data=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_Variables2 obj=new Static_Variables2();
		Static_Variables2 obj1=new Static_Variables2();
		System.out.println(obj.data);
		System.out.println(obj1.data);
		obj.data=500;
		System.out.println(obj.data);
		System.out.println(obj1.data);
	}

}
