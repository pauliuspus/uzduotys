public class trys {
    public static void main(String[] args) {
        int[][] masyvas3 = {{4,5,6}, {7,9,8}, {8,2,1,4}};
        for (int i = masyvas3.length - 1; i >= 0; i--) {
            for (int k = 0; k < masyvas3[i].length; k++) {
                System.out.println(masyvas3[i][k]);
            }
        }
    }
}
// isspausdino masyvus nuo galo.