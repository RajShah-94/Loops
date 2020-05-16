public class BandMatrix {
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int a;
        int s = 0;
        for (int b = 0; b < width; b++) {
            for (a = 0; a < width; a++) {
                if (a >= (s - n) && a <= (s + n)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("0  ");
                }
            }
            System.out.println("");
            a = 0;
            s++;
        }
    }
}
