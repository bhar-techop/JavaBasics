package in.basics;

class T{
	static int data=1000;
}
public class Static_Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(data) it shows error because it is not in same class;
		System.out.println(T.data);	
		
		T obj=new T();
		System.out.println(obj.data);
		//why the yellow line shows is because it is always static variable  recommended  to use  className we can access the variable
		
	}

}
