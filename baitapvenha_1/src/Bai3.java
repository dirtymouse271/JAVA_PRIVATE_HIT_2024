import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] mang1 = new int[n];
        for (int i = 0; i < n; i++) {
            mang1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mang1[i] < mang1[j]) {
                    int temp = mang1[i];
                    mang1[i] = mang1[j];
                    mang1[j] = temp;
                }
            }
        }
        System.out.println(mang1[0]);
        System.out.println(mang1[1]);
        sc.close();
    }
}
