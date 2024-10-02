package in.basics;

public class Constructor_VI {
	int empId;
	String eName;
	Constructor_VI(int id,String name){
		empId=id;
		eName=name;
	}
	public void getInfo() {
		System.out.println("empId:"+empId+"empName:"+eName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_VI obj=new Constructor_VI(101,"harish");
		obj.getInfo();
		Constructor_VI obj1=new Constructor_VI(101,"harish");
		obj1.getInfo();

	}

}
