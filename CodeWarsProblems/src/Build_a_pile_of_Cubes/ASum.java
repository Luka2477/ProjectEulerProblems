package Build_a_pile_of_Cubes;

public class ASum {

    public static long findNb(long m) {
        long maxBound = (long) Math.pow(m, 1/3.5d);

        long i;
        for (i = 0; i <= maxBound; i++) {
            long sum = 0;
            for (long j = i; j > 0; j--) {
                sum += Math.pow(j, 3);
            }

            if (sum == m) {
                break;
            }
        }

        return i == maxBound ? -1 : i;
    }

}
