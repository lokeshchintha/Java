package lokesh;

/*we set all fields private 
 * we create setter and getter methods to set and get methods
 */

public class Student {
    private String name;
    private int age;
    private String course;

    // Constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age remains unchanged.");
        }
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Alice", 20, "Computer Science");

        // Displaying initial information
        System.out.println("Initial Student Information:");
        student1.displayInfo();

        // Performing operations on the student object
        student1.setAge(21);
        student1.setCourse("Information Technology");

        // Displaying updated information
        System.out.println("\nUpdated Student Information:");
        student1.displayInfo();
    }
}

