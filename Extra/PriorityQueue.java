import java.util.*;

class Testing{
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(5);
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(2);

        System.out.println(pq.toString());

        System.out.println(pq.peek());

        System.out.println(pq.poll());

        System.out.println(pq.toString());

    }
}

// Output :
// [5, 3, 4, 1, 2]
// 5
// 5
// [4, 3, 2, 1]
