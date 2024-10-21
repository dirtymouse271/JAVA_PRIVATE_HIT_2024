import java.util.Scanner;

public class Bai1 {
    public static StringBuilder convert(int a, int b) {
        String c = "0123456789ABCDEF";
        StringBuilder answer = new StringBuilder();
        while (a > 0) {
            answer.append(c.charAt(a % b));
            a = a/b;
        }
        return answer.reverse();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(convert(a,b));
    }
}
