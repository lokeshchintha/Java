//single inheritance(a<-b)
class Animal{
	void printA() {
		System.out.println("animal");
	}
	static void printA1() {
		System.out.println("animal1");
	}
}

class Dog extends Animal{
	void printD() {
		System.out.println("dog");
	}
	static void printD1() {
		System.out.println("dog1");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.printA();// animal
		obj.printD();// dog
		obj.printA1();// animal1
		obj.printD1();// dog1
	}
}



//multilevel inheritance (a<-b<-c)
class Animal{
	void printA() {
		System.out.println("animal");
	}
	static void printA1() {
		System.out.println("animal1");
	}
}

class Dog extends Animal{
	void printD() {
		System.out.println("dog");
	}
	static void printD1() {
		System.out.println("dog1");
	}
}

class Labrador extends Dog{
	void printL() {
		System.out.println("labrador");
	}
	static void printL1() {
		System.out.println("labrador1");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Labrador obj = new Labrador();
		obj.printA();// animal
		obj.printD();// dog
		obj.printL();// labrador
		obj.printA1();// animal1
		obj.printD1();// dog1
		obj.printL1();// labrador1
	}
}


//hierarchial inheritance(a<-b and a<-c)(more than 1 child class)
class Animal{
	void printA() {
		System.out.println("animal");
	}
	static void printA1() {
		System.out.println("animal1");
	}
}

class Dog extends Animal{
	void printD() {
		System.out.println("dog");
	}
	static void printD1() {
		System.out.println("dog1");
	}
}

class Cat extends Animal{
	void printC() {
		System.out.println("cat");
	}
	static void printC1() {
		System.out.println("cat1");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.printA();// animal
		dog.printD();// dog
		dog.printA1();// animal1
		dog.printD1();// dog1
		
		
		cat.printA();// animal
		cat.printC();// cat
		cat.printA1();// animal1
		cat.printC1();// cat1
	}
}
