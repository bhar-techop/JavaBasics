package in.basics;

public class Method_II {
	int data=100;
	int data1=100;
	//non static method can access directly  instance variable and static variable but  should be inside same class only 
public void m1() {
	System.out.println(data);
	System.out.println(data1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_II obj=new Method_II();
		obj.m1();
	}

}
