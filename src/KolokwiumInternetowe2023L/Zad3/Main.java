package KolokwiumInternetowe2023L.Zad3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{0, 0, 1}, {0, 1, 0}, {0, 0, 1}};
        for(int[] rArr : operation(arr1, arr2)){
            System.out.println(Arrays.toString(rArr));
        }
    }

    public static int[][] operation(int[][] a, int [][] b){
        int rows_a = a.length;
        int cols_a = a[0].length;
        int rows_b = b.length;
        int cols_b = b[0].length;

        if(cols_a != cols_b){
            throw new IllegalArgumentException("IAE");
        }
        int[][] result = new int[rows_a][rows_b];

        for(int i = 0; i < rows_a; i++) {
            for (int j = 0; j < cols_b; j++) {
                for (int k = 0; k < cols_a; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
