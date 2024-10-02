package in.basics;

public class Constructor_IV {
    public Constructor_IV() {
    	System.out.println("Hello from default constructor");
    }
    public Constructor_IV(int a) {
    	System.out.println("Hello from one-arg constructor");
    } 
	public static void main(String[] args) {
		Constructor_IV c1=new Constructor_IV(10);
        
	}

}
