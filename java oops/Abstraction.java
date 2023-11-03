package lokesh;

/*abstract methods and classes can be declared
 *abstract methods have no method body
 *if we declare any method as abstract then that class must be declared as abstract
 *we cannot create object for abstract classes
 *abstract classes can have zero or more abstract methods which are not allowed in non abstract methods
 *the child class which inherits the abstract class must implement abstract methods
 *abstract methods can be implement for each child classes 
 */

abstract class Parts{
	abstract void function();
	void fun1() {
		System.out.println("fun1");// abstract classes can hav non abstarct methods
	}
	
	abstract void fun();
}

class Brakes extends Parts{
	void function() {
		System.out.println("function");
	}
	void fun() {
		System.out.println("fun");
	}
}

public class Abstraction {
//	Parts p = new Parts();//error cannot create object
	public static void main(String args[]) {
		Brakes b = new Brakes();
		b.fun();// fun
		b.fun1();// fun1
		b.function();// function
	}
	
	
}
