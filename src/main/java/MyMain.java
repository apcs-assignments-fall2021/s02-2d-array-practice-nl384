public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        // YOUR CODE HERE
        int num = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] % 2 != 0) {
                    num++;
                }
            }
        }
        return num;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        // YOUR CODE HERE
        int x = Integer.MIN_VALUE;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] > x) {
                    x = mat[row][col];
                }
            }
        }
        return x;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        // YOUR CODE HERE
        for (int row = 0; row < mat.length; row++) {
            int first = mat[row][0];
            for (int col = 0; col < mat[0].length - 1; col++) {
                mat[row][col] = mat[row][col+1];
            }
            mat[row][mat[row].length-1] = first;
        }
        return mat;
    }

    // Creates a new array list of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        // YOUR CODE HERE
        int[][] x = new int[arraySize][arraySize];
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[0].length; col++) {
                x[row][col] = row + col;
            }
        }
        return x;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double sum = 0;
        int count = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                sum = sum + mat[row][col];
                count++;
            }
        }
        return sum/count;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) {
        int count = 0;
        int count2 = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; i < mat.length * mat[0].length; i++){
                    count ++;
                }}}
        double[] arr = new double[count];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; i < mat.length * mat[0].length; i++){
                    arr[count2] = mat[row][col];
                    count2 ++; }}}

        if (count % 2 == 0){
            return (double)(arr[(int)count/2] + arr[(int)count/2-1])/2;
        }

        else {
            return (Math.round(arr[count/2]));}

    }


    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        int count = 0;
        int most = 0;
        double mode = 0;
        double[] arr = new double[mat.length * mat[0].length];
        double[] arr2 = new double[mat.length * mat[0].length];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                arr[count] = mat[row][col];
                arr2[count] = mat[row][col];
                count++;
            }}
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; i < mat.length * mat[0].length; i++){
                    count ++;
                }}}

        for(int i = 0; i < arr.length-1; i++){
            int equal = 0;
            if (arr[i] == arr[i+1]){equal++;}
            if (equal > most){equal = most; mode = arr[i];}
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
