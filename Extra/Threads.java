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

// we can create classes using lambda expressions and anonymous classes as Runnable is a fucntional interface

class Testing{
        public static void main(String[] args) {

            // Anonymous classes
            Runnable obj1 = new Runnable(){
                @Override
                public void run(){
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Hi");
                    }
                }
            };

            // lambda expressions
            Runnable obj2 = () ->{
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Hello");
                    }
                };

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();
    
        }
    }

// If we declare any method as synchronized then it will accessible by only one thread at a time

// Thread.join

// Thread states - > (New, -> when we create thread , when we use start it will go to runnable state
// Runnable, -> waits until it starts execution
// Running,  -> running in cpu
// Waiting,  -> if we use sleep() it went to waiting state
// Dead -> if we use stop() it will go to dead state
// )

class Testing{
        public static void main(String[] args) throws InterruptedException {

            // Anonymous classes
            Runnable obj1 = new Runnable(){
                @Override
                public void run(){
                    for (int i = 0; i < 100; i++) {
                        System.out.println("Hi");
                    }
                }
            };

            // lambda expressions
            Runnable obj2 = () ->{
                    for (int i = 0; i < 100; i++) {
                        System.out.println("Hello");
                    }
                };

            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);

            t1.start();
            t2.start();


             System.out.println("Hellox"); // if we give like this it will execute simultaneously with t1 and t2 
            //  but if we want to execute after completion of t1 and t2 we use join()

             t1.join(); // it makes sure thread1 is completed after completion it go to next steps
             t2.join(); // it makes sure thread2 is completed it also has Interrupted Exception

             System.out.println("Hello1"); // It will execute after t1 and t2 completes its processes

    
        }
    }
