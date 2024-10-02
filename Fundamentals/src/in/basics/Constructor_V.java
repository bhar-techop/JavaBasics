package in.basics;

public class Constructor_V {
int empId=101;
String empName="harish";
Constructor_V(){
	System.out.println("object created");
}
public void getInfo() {
	System.out.println("empId:"+empId+"empName:"+empName);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_V c1=new Constructor_V();
		c1.getInfo();
		Constructor_V c2=new Constructor_V();
		c2.getInfo();
	}

}
