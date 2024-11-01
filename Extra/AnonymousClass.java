class Testing{
    public static void main(String[] args) {
        A obj = new A(){ //Anonymous inner classes
            public void show(){
                System.out.println("in Config");
            }
        };
        obj.show();
        A obj1 = new A();
        obj1.show();
    }
}

class A{
    public void show(){
        System.out.println("in show");
    }
}

// Output : 
// in Config
// in show
