

class Testing{
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // in A Show

        A.B obj1 = obj.new B();
        obj1.show(); // in B Show

        A.C obj2 = new A.C();
        obj2.show(); // in C Show

    }
}

class A{
    public void show(){
        System.out.println("in A show");
    }

    class B{
        public void show(){
            System.out.println("in B Show");
        }
    }

    static class C{
        public void show(){
            System.out.println("in C Show");
        }
    }
}
