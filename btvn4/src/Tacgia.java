import java.util.Scanner;

public class Tacgia {
    private String name;

    Scanner sc = new Scanner(System.in);

    public Tacgia(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nhapten(Scanner sc){
        System.out.println("nhap ten tac gia: ");
        name = sc.nextLine();
    }
}
