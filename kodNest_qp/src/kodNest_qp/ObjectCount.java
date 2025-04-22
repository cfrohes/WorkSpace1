package kodNest_qp;

public class ObjectCount {
	public static void main(String[] args) {
	Demo01 d = new Demo01();
	
	new Demo01(55);
	
	Demo01 d3 = new Demo01("java");
	
	
	System.out.println(Demo01.count);
	}
}
class Demo01 {
	private static Demo01 instance = null;
	static int count = 0;
	
	public Demo01() {
		//count++;
		
	}
	public Demo01(int age) {
		//count++;
		//System.out.println("age:  "+ age);
		
	}
	public Demo01(String sub) {
		//count++;
		//System.out.println("sub : " + sub);	
	}
	
	{
		count++;
		
	}
	
	
}
