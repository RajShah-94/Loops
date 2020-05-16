public class RandomWalkers {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;
        int z = 0;
        double ave = 0;
        while (z < trials) {
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
                steps++;
            }
            z++;
            x = 0;
            y = 0;
            ave = (steps + ave);
            steps = 0;
        }
        System.out.println("average number of steps = " + (ave / z));
    }
}
