package Find_the_odd_int;

import java.util.HashMap;

public class FindOdd {

    public static int findIt(int[] a) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int n : a) {
            if (!numbers.containsKey(n)) {
                numbers.put(n, 1);
            } else {
                numbers.put(n, numbers.get(n) + 1);
            }
        }

        for (Integer v : numbers.keySet()) {
            if (numbers.get(v) % 2 == 1) {
                return v;
            }
        }

        return 0;
    }

}
