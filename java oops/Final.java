final class f {
	final void fun() {
		System.out.println("hello");
	}
}

/*
 * class g extends f{//cannot subclass final classes
 * 
 * void fun() { System.out.println("hii"); } cannot be overridden final methods
 * 
 * }
 */

public class Final {
	final int a = 10;

	public static void main(String args[]) {
		Final f = new Final();
		System.out.println(f.a);
//		f.a=10;//error cannot change final variables
	}
}
