import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tich = 1;
        if (n == 0) {
            System.out.println(n);
        } else {
            while (n != 0) {
                tich *= n % 10;
                n = n / 10;
            }
            System.out.println(Math.abs(tich));
            sc.close();
        }
    }
}
