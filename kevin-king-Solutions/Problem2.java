package projecteuler;

public class Problem2 {

    public static void main(String[] args) {
        int max = 4000000;
        int sum = 0;
        
        int fib_old = 0;
        int fib_curr = 1;
        int fib_new;
        
        while (fib_curr < max) {
            fib_new = fib_curr + fib_old;
            fib_old = fib_curr;
            fib_curr = fib_new;
            
            if (fib_curr % 2 == 0) {
                sum = sum + fib_new;
            }
        }
        System.out.println(sum);
    }
}
