package p002;

public class App {

    public static int sumOfFiboEvenValues (int maxBound, int n1, int n2, int sum) {
        int newN = n1 + n2;

        if (newN % 2 == 0) {
            sum += newN;
        }

        if (newN < maxBound) {
            return sumOfFiboEvenValues(maxBound, n2, newN, sum);
        } else {
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOfFiboEvenValues(4000000, 1, 1, 0));
    }

}
