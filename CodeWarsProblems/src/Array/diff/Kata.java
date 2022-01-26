package Array.diff;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        int removed = 0;

        for (int i = a.length-1; i >= 0; i--) {
            if (contains(a[i], b)) {
                remove(a, i);
                removed++;
            }
        }

        int[] c = new int[a.length-removed];
        System.arraycopy(a, 0, c, 0, c.length);
        return c;
    }

    public static boolean contains (int a, int[] b) {
        boolean found = false;
        int j = 0;

        while (j < b.length && !found) {
            if (a == b[j]) {
                found = true;
            } else {
                j++;
            }
        }

        return found;
    }

    public static void remove (int[] a, int i) {
        while (i < a.length-1) {
            a[i] = a[i + 1];
            i++;
        }
    }

}
