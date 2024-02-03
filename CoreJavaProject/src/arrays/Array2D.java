package arrays;

public class Array2D {
    public static void main(String[] args) {

        String s = "hello";
        s="welcome";
        System.out.println(s);
        // jagged array => enum data type
        /**
         * array.length => no of rows
         * check number of columns in every row
         * array[rowindex].length
         * 3*2*4
         * 000 001 002 003
         * 010
         */
        int scores[][] = new int[3][2]; // 3*2 => 3 rows and 2 columns
        scores[0][0]= 12;
        scores[0][1]= 12;
        System.out.println(scores.length);
        System.out.println(scores[0].length);
        // outer loop => iterates for rows
        for (int i = 0; i < scores.length; i++) {
            // inner loop => iterate for column
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = i+j+1;
            }
        }
        for (int i = 0; i < scores.length; i++) {
            // inner loop => iterate for column
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }

    }
}
