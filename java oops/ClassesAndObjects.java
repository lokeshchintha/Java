public class ClassesAndObjects {
	static int a=10;
	int b=20;
	
	static void fun() {
		System.out.println("static");
	}
	void fun1() {
		System.out.println("instance");
	}

	public static void main(String[] args) {
		ClassesAndObjects obj= new ClassesAndObjects();
		ClassesAndObjects obj1=new ClassesAndObjects();
		System.out.println(obj.a);// 10
		System.out.println(obj.b);// 20
		System.out.println(a);// 10
//		System.out.println(b);// error instance variables cannot be accessed without object
		System.out.println(ClassesAndObjects.a);// 10
//		System.out.println(ClassesAndObjects.b);// cannot access instance variables
		obj.fun();// static
		obj.fun1();// instance
		fun();// static
//		fun1();// error instance methods cannot be accessed without object
		ClassesAndObjects.fun();// static
//		ClassesAndObjects.fun1();//cannot access instance methods
		
		
		
//		static variables for any object are same . all objects have same values
//		if obj is updated then obj1 is also updated
		
//		instance variables may differ . all objects have independent values
//		if obj is updated then obj1 is not updated it has its own value
		
		obj.a=100;
		obj.b=200;
		System.out.println(obj.a);// 100
		System.out.println(obj.b);// 200
		System.out.println(obj1.a);// 100
		System.out.println(obj1.b);// 20
	}
}
