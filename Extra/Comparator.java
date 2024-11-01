// Comparator shortcut

import java.util.*;

class Testing{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(22,34,24,12,54,66,78,35));

        Comparator<Integer> com = (a,b) -> a%10 > b%10 ? 1 : -1;

        Collections.sort(arr,com);

        System.out.println(arr);
    }
}

// Output : 
// [12, 22, 54, 24, 34, 35, 66, 78]
