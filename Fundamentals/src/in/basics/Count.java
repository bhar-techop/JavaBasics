package in.basics;

public class Count {
	static int id=0;
	Count(int id){
		System.out.println("object created:"+id);

	}
    public  int getInfo(int id,String name) {
    	System.out.println("emp id:"+id+"employee name:"+name);
		return id;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Count e1=new Count(id);
    e1.getInfo(100,"harish");
    Count e2=new Count(id);
    e2.getInfo(102,"har");
	}

}
