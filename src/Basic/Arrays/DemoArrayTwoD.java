package Basic.Arrays;

class DemoArrayTwoD {
    public static void main(String[] agr) {
        int myTwoArray[][] = new int[4][5];

        int i, j, k = 1;

        // Fill the array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                myTwoArray[i][j] = (i + j) * k;
                k++;
            }
        }

        // Print the array
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println("myTwoArray[" + i + "][" + j + "] = " + myTwoArray[i][j]);
            }
        }
    }
}