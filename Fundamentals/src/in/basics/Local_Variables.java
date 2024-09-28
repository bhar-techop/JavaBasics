package in.basics;

public class Local_Variables {
	public int R() {
		int data=50;
		System.out.println(data);
		return data;
	}
	public static void main(String[]args) {
		Local_Variables obj=new Local_Variables();
		System.out.println(obj.R());
//		System.out.println(obj.R().data);it shows error because you cannot acces local variable outside method
//you can return a value not a local variable
	}

}
