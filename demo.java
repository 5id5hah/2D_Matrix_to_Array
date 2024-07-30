import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        int r = matrix.length;
        int c = matrix.length;
        int[] arr = new int[r*c];
        int index = 0;
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c; j++) {
                arr[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }

}
