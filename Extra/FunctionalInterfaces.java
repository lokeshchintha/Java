// Anonymous inner classes as Lambda Expressions
// FunctionalInterface have only one method
// We can use lambda expression for only functioncal interfaces
// Annotation should be used in order to make interface as fucntional interface else it will accept more than one method
// Without annotation also it works but without annotation we can declare any number of methods with annotation only one method accepted if more methods give it will raise an error

class Testing{
    public static void main(String[] args) {
        A ob = () -> System.out.println("Hello");
        ob.show(); // Hello

        A obj = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };

        obj.show(); // Hello World


        B obj1 = (int i) ->System.out.println("Hello " + i);

        // int is optional 
        // B obj2 = i -> System.out.println("Hello " + i);
        // both works same
        // if more than 1 parameter we have to use parenthesis
        // B obj1 = (i,j) ->System.out.println("Hello " + i);

        obj1.run(5); // Hello 5

        Calc obj3 = (i,j) -> (i+j);
        System.out.println(obj3.add(3, 5)); // 8
    }
}

@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    void run(int i);
}

@FunctionalInterface
interface Calc{
    int add(int a,int b);
}


