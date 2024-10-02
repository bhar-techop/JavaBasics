package in.basics;

public class Method_IV {
int data=100;
static int data1=110;
public void m1(Method_IV obj) {
	   System.out.println(data);
	   System.out.println(obj.data1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_IV obj=new Method_IV();
		obj.m1(obj);
		obj.m1(obj);
		obj.m1(obj);
	}

}
