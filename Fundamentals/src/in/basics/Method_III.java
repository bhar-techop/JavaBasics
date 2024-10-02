package in.basics;

public class Method_III {
	int data=100;
	static int data2=200;
	//static method cannot access directly  instance variable instead of that we can access instance variable by creating object
	//and static variable but  should be inside same class only 
	
public static void m1() {
	Method_III obj2=new Method_III();
	System.out.println(data2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_III obj=new Method_III();

Method_III.m1();
Method_III.m1();
Method_III.m1();
	}

}
