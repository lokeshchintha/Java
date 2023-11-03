package lokesh;

/*we set all fields private 
 * we create setter and getter methods to set and get methods
 */

public class Encapsulation {
	
	private String name = "lokesh";
	private int age=20;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String args[]) {
		Encapsulation e = new Encapsulation();
		System.out.println(e.getName());// lokesh
		e.setName("loke");
		System.out.println(e.getName());// loke
		System.out.println(e.getAge());// 20
		e.setAge(19);
		System.out.println(e.getAge());// 19
	}
}
