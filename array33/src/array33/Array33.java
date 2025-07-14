package array33;

public class Array33 {

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        a[0][0] = 3;
        a[0][1] = 4;
        a[0][2] = 9;
        a[1][0] = 2;
        a[1][1] = 9;
        a[1][2] = 11;
        a[2][0] = 4;
        a[2][1] = 6;
        a[2][2] = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = a[i][j] + sum;
            }
            System.out.println("sum of row" + i + 1 + "=" + sum);
            sum = 0;
        }
        System.out.println();
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum1 = a[j][i] + sum1;
            }
            System.out.println("sum of colum" + i + 1 + "=" + sum1);
            sum1 = 0;
        }
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum2 = a[i][i] + sum2;
        }
        System.out.println("1st diagonal=" + sum2);
        int sum3 = 0;
        int j=2;
        for (int i =0; i <= 2; i++) {
                sum3 = a[i][j]+sum3; 
                j--;
        }
        System.out.println("2nd diagonal=" + sum3);
    }
}
