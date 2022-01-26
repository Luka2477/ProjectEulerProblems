package p001;

public class App {

    public static int sumOfMultiplesOf3Or5 (int maxBound) {
        int sum = 0;

        for (int i = 3; i < maxBound; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMultiplesOf3Or5(1000));
    }

}
