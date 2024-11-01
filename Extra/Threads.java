// Type 1
// Threads

// Every thread has to extend Thread class or Runnable interface
// start is used to call the method and run is used as method name

class Testing{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // both run 
        obj2.start(); // simultaneously

    }
}

class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}


// Type 2
class Testing{
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // both run 
        obj2.start(); // simultaneously

    }
}

class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10); // it will make thread to sleep for 10 milliseconds it is a checked exception so we have to handle exception we cannot use throws a s it is an overridden method
            } catch (InterruptedException ex) {}
            
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {}
        }
    }
}

// Runnable Interface
class Testing{
    public static void main(String[] args) {
        A obj1 = new A(); // Runnable object we can alse declare as
        B obj2 = new B(); // Runnable obj2 = new B();

        Thread t1 = new Thread(obj1); // converts a runnable object to thread
        Thread t2 = new Thread(obj2);

        t1.start(); // both run 
        t2.start(); // simultaneously

    }
}

class A implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            
        }
    }
}

class B implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
    }
}

