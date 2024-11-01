// we can use finally block for closing files 
import java.util.*;

class Testing{
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(n);

        } catch (Exception e) {
            System.out.println("something went wrong");
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
