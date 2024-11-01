//we can also use try with resources
import java.util.Scanner;

class Testing{
    public static void main(String[] args) {
        
        
        try(Scanner sc = new Scanner(System.in)) { // It automatically closes the scanner class every try block must have either finally or catch except these try resource blocks
            int n = sc.nextInt();
            System.out.println(n);
        }
    }
}
