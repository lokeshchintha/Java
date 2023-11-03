/*used to achieve 100% abstraction
 * class,class->extends
 * interface,class->implements
 * interface,interface->extends
 * only abstract methods and fields are static,final
 * all methods and fields are public by default
 * abstract methods doesn't have any implementation it should be implement by child class 
 * we can achieve multiple inheritance(one child class have more than one super class)
*/

interface Printable{
	int a=10;
	void print();
}

interface Showable{
	void show();
}


public class Interface implements Printable,Showable {
	public void print() {           // visibilty should be declare explicitly as public for abstract method implementation
		System.out.println("print");
	}
	public void show() {
		System.out.println("show");
	}
	public static void main(String[] args) {
		Interface i = new Interface();
		i.print();// print
		i.show();// show
		System.out.println(i.a);// 10
//		i.a=20;// error final variables cannot be redeclared
	}
}
