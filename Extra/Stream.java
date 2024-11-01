// Stream
import java.util.stream.*;
import java.util.*;
class Testing{
    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(l);

        Stream<Integer> st = l.stream();

        Stream<Integer> st1 = st.filter(n -> n%2==0);
        
        Stream<Integer> st2 = st1.map(n -> n*2);

        int st3 = st2.reduce(0, (c,e) -> c+e);

        System.out.println(st3);



        int s = l.stream()
                .filter(n -> n%2==0)
                .map(n->n*2)
                .reduce(0, (c,e)->c+e);

        System.out.println(s);

    }
}

// Output : 
// [1, 2, 3, 4, 5, 6]
// 24
// 24
