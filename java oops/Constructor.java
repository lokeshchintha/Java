public class Constructor {
	static int a;
	int b;
	Constructor(){
		a=0;
		b=0;
	}
	Constructor(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println(obj.a);// 0
		System.out.println(obj.b);// 0
		Constructor obj1 = new Constructor(10,20);
		System.out.println(obj1.a);// 10
		System.out.println(obj1.b);// 20
		System.out.println(obj.a);// 10
		System.out.println(obj.b);// 0
		
		
	}
}
