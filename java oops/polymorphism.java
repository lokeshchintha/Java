//compile-time polymorphism -> MethodOverloading and MethodHiding
//run-time polymorphism -> MethodOverriding

public class MethodOverloading {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	static double add(double a,double b,double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(1,2));// 3
		System.out.println(add(1,2,3));// 6
		System.out.println(add(1.1,2.8,3.1));// 7.0

	}
}






class Animal{
	static void run1() {
		System.out.println("Animal1");
	}
	void run2() {
		System.out.println("Animal2");
	}
}
class Cheetah extends Animal{
	static void run1() {
		System.out.println("Cheetah1");
	}
	void run2() {
		System.out.println("Cheetah2");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Animal a = new Animal();
		Cheetah c = new Cheetah();
		Animal ac = new Cheetah();
		a.run1();// Animal1
		a.run2();//Animal2
		c.run1();// Cheetah1
		c.run2();// Cheetah2
		ac.run1();// Animal1 // methodhiding // takes reference(animal)
		ac.run2();// Cheetah2 // methodoverriding // takes runtime-object(cheetah)
	}
}
