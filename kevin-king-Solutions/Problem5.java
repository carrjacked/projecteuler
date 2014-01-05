package projecteuler;

public class Problem5 {

    static boolean isDivisible(int value) {
        int count = 0;
        
        
        for (int mod = 1; mod <= 20 ; mod++) {
            if (value % mod == 0) {
                count++;
            }
        }
        
        if (count == 20) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        int value = 20;  //232792560
        while (!isDivisible(value)) {
            value++;
        }
        System.out.println(value);
    }
}
