import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] result1;
        String[] result2;
        for(char c : str.toCharArray()) {
            if (Character.isDigit(c))
                System.out.println(c);
        }
    }
}
