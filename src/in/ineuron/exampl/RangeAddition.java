package in.ineuron.exampl;

import java.util.Arrays;

public class MatrixOperations {
    public static int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;

        for (int[] op : ops) {
            int ai = op[0];
            int bi = op[1];
            minX = Math.min(minX, ai);
            minY = Math.min(minY, bi);
        }

        return minX * minY;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};

        int result = maxCount(m, n, ops);
        System.out.println("Number of maximum integers: " + result);
    }
}
