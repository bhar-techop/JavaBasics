package in.basics;

public class Instance_Variable {
	int data=100;
public static void main(String[]args) {
	//classname objname=new classname
	Instance_Variable obj1=new Instance_Variable();
	Instance_Variable obj2=new Instance_Variable();
	//acess instance variable:objname.varname
	System.out.println(obj1.data);
	System.out.println(obj2.data);
	obj1.data=500;
	System.out.println(obj1.data);
	System.out.println(obj2.data);
}
}
