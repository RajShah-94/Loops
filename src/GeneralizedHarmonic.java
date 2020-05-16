public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double riemann = 0;
        for (double s = 1; s < n + 1; s++) {
            riemann = riemann +(1 /(Math.pow(s, r)));
        }
       System.out.println(riemann);
    }
}
