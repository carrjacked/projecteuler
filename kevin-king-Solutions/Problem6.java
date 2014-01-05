package projecteuler;

public class Problem6 {

    public static void main(String[] args) {
        int squaresum = 0;
        int sumsquare = 0;
        for (int i = 1; i <= 100 ; i++) {
            squaresum = squaresum + i*i;
            sumsquare = sumsquare + i;
        }
        sumsquare = sumsquare*sumsquare;
        
        System.out.println(sumsquare - squaresum);
    }
}
