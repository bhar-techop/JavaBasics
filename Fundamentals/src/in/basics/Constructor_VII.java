package in.basics;

public class Constructor_VII {
static int count=0;
Constructor_VII(){
	count++;
}
public int getInfo() {
	return  count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_VII obj=new Constructor_VII();
		Constructor_VII obj1=new Constructor_VII();
		System.out.println(obj.getInfo());
	
	}

}
