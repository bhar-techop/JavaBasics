package in.basics;

public class Method_V {
    int data=10;
//    public  void m1() {
//    	System.out.println(data);
//    	return;
//    }
    public  int  m1() {
    	int result=data*data;
    	return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=new Method_V().m1();
		System.out.println(result);
		
	}

}
