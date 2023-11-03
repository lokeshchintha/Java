class Device{
	String n ="Device";
	Device(){
		System.out.println("i am super class constructor");
	}
	void print() {
		System.out.println("Device "+n);
	}
}

class Tv extends Device{
	Tv(){
		super();
		/* calls super class constructor  
		 * it should only be called from child class constructor and should be first statement in child class constructor)
		 */
		System.out.println("i am child class constructor");
	}
	String n="Tv";
	void print() {
		System.out.println("Tv "+n);
		System.out.println("Tv "+super.n);// calls super class n
		super.print();// calls super class method
	}
}

public class Super {
	public static void main(String[] args) {
		Tv t= new Tv();
		/*
		 * i am super class constructor
		 * i am child class constructor
		 */
		t.print();
			/* 
			 * Tv Tv
			 * Tv Device
			 * Device Device
			*/
		
	}
}
