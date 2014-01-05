package projecteuler;

public class Problem3 {

    static int findFactor(long number) {
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number = number/i;
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
//        System.out.println(findFactor(13195));
        System.out.println(findFactor(600851475143L));
    }
}
