package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1, 2, 3);
        System.out.println(count);
    }

    public static int multiples(int n, int a,  int b) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleByThree = i % a == 0;
            boolean divisibleByFive = i % b == 0;
            if (divisibleByThree ||  divisibleByFive) {
                count++;
            }
        }
        return count;
    }
}
