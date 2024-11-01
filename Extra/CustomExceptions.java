// Hierarchy
//                          object
//                            |
//                            v
//                      ----throwable----
//                      |               |
//                      v               v
//                    Errors          Exceptions ->(unchecked Exceptions -> Runtime Exceptions(ArithmeticException,NullPOinterException,IndexOutOfBoundsExeption)
//                                                     checked Exceptions -> SQLException,IOExeception
//                                                         )
// ------------------------------------------------------------------------------------------------------------------------------
// Custom Exceptions
class Testing{
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            if (j==0){
                throw new MyException("Hey you can't divide with zero");
            }
        } 
        catch (MyException e) {
            System.out.println(e);
        }
    }
}

class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

// Output : 
// MyException: Hey you can't divide with zero
