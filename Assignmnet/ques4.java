public class ques4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        long row_sum = 0;
        long col_sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                row_sum += array[i][j];
            }
            System.out.println("rowsum of row :" + row_sum);
            row_sum = 0;
        }
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                col_sum += array[j][i];
            }
            System.out.println("rowsum of col :" + col_sum);
            col_sum = 0;
        }
    }
}
