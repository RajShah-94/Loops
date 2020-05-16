public class RandomWalker {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        System.out.println("(" + x + ", " + y + ")");
        while ((Math.abs(x) + Math.abs(y)) < r) {
            int b = 4;
            double a = Math.random();
            int value = (int) (a * b);
            if (value == 0) {
                x = x - 1;
            }
            if (value == 1) {
                x = x + 1;
            }
            if (value == 2) {
                y = y - 1;
            }
            if (value == 3) {
                y = y + 1;
            }
            System.out.println("(" + x + ", " + y + ")");
            steps++;
        }
        System.out.println("steps = " + steps);
    }
}
