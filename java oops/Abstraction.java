package lokesh;

/*abstract methods and classes can be declared
 *abstract methods have no method body
 *if we declare any method as abstract then that class must be declared as abstract
 *we cannot create object for abstract classes
 *abstract classes can have zero or more abstract methods which are not allowed in non abstract classes
 *the child class which inherits the abstract class must implement abstract methods
 *abstract methods can be implement for each child classes 
 */

abstract class Shape {
    int x;
    int y;

    abstract double calculateArea();

    void display() {    // abstract classes can hav non abstarct methods

        System.out.println("This is a shape.");
        
    }
}


class Circle extends Shape {
    double radius;

    Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void displayCircleInfo() {
        System.out.println("Circle - Radius: " + radius);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(int x, int y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    void displayRectangleInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
    }
}

class lokesh {
    public static void main(String[] args) {

        //	Shape object = new Shape(); //error cannot create object
        

        Circle circle = new Circle(1, 2, 5.0);
        Rectangle rectangle = new Rectangle(3, 4, 6.0, 8.0);


        Shape shape1 = circle;
        Shape shape2 = rectangle;


        shape1.display();
        shape2.display();


        System.out.println("Area of Circle: " + shape1.calculateArea());
        System.out.println("Area of Rectangle: " + shape2.calculateArea());


        ((Circle) shape1).displayCircleInfo();
        ((Rectangle) shape2).displayRectangleInfo();


    }
}
