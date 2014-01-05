package projecteuler;

public class Problem1 {
    
    public static void main(String[] args) {
        int max = 1000;
        int sum = 0;

        for (int i = 0; i < max; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            } else if (i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
