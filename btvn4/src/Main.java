import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static int index = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[index];
        book[0] = new Book(12345, "khoa hoc1", "Thanh", 2012, "khcb", 100000);
        book[1] = new Book(12346, "khoa hoc2", "Keo", 2015, "toan", 150000);
        book[2] = new Book(12347, "khoa hoc3", "P.Thanh", 2020, "van", 170000);
        book[3] = new Book(12348, "khoa hoc4", "D.Thanh", 2000, "anh", 230000);
        book[4] = new Book(12349, "khoa hoc5", "Thanh Pham", 2024, "tin hoc", 180000);

        while (true) {
            System.out.println("1, Them sach moi");
            System.out.println("2, Chinh sua thong tin sach");
            System.out.println("3, In danh sach cac cuon sach trong mang");
            System.out.println("4, In cuon sach lau doi nhat");
            System.out.println("5, In sach phu hop voi yeu cau nguoi mua");
            System.out.println("6, Sap xep lai danh sach");
            System.out.println("7, Exit");
            System.out.print("Lua chon chuc nang: ");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    book = themSach(book);
                    break;
                case 2:
                    System.out.println("Nhap ma sach: ");
                    int maSach = sc.nextInt();
                    for (Book b : book){
                        if(b.getMaSach() == maSach) {
                            suaThongTin(b);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhung cuon sach co trong mang la: ");
                    for(Book b: book) {
                        b.display();
                    }
                    break;
                case 4:
                    System.out.print("Cuon sach lau doi co kinh nhat la: ");
                    namCuNhat(book);
                    break;
                case 5:
                    System.out.println("Nhap gia tien yeu cau: ");
                    cuonSachPhuHop(book);
                    break;
                case 6:
                    System.out.println("Chon kieu sap xep: ");
                    System.out.println("1.Sap xep theo ten.");
                    System.out.println("2.Sap xep theo gia tien.");
                    System.out.println("3.Exit.");
                    int luachon = sc.nextInt();
                    switch (luachon){
                        case 1:
                            sapXepTheoTen(book);
                            break;
                        case 2:
                            sapXepTheoGiaTien(book);
                            break;
                        case 3:
                            System.exit(1);
                            break;
                        default:
                            break;
                    }
                case 7:
                    System.exit(1);
                default:
                    break;
            }
        }
    }

    public static Book[] themSach (Book[] book){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach can them: ");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] book1 = new Book[n];
        for (int i = 0; i < n; i++) {
        book1[i] = new Book();
        book1[i].nhapSach(sc);
        }

        Book[] book2 = new Book[index+n];
        System.arraycopy(book, 0, book2, 0, index);
        System.arraycopy(book1, 0, book2, index, n);
        index+=n;

        return book2;
    }

    public static void suaThongTin(Book b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma Sach: ");
        b.setMaSach(sc.nextInt());
        sc.nextLine();
        System.out.print("Ten Sach: ");
        b.setTenSach(sc.nextLine());
        System.out.print("Ten Tac Gia: ");
        b.setTenTacGia(sc.nextLine());
        System.out.print("Nam San Xuat: ");
        b.setNamSanXuat(sc.nextInt());
        sc.nextLine();
        System.out.print("Tom tat Noi Dung: ");
        b.setTomTatNoiDung(sc.nextLine());
        System.out.print("Gia Tien: ");
        b.setGiaTien(sc.nextDouble());
        sc.nextLine();
    }

    public static void namCuNhat(Book[] book){
        Book namunhat = Arrays.stream(book).min(Comparator.comparing(Book::getNamSanXuat)).orElse(null);
        if(namunhat!= null){
            System.out.print("Cuon sach co tuoi doi lau nhat la: ");
            System.out.println(namunhat);
        }
    }

    public static void cuonSachPhuHop(Book[] book){
        Scanner sc = new Scanner(System.in);
        int giatienyeucau =sc.nextInt();
        for(Book b: book){
            if (giatienyeucau>=b.getGiaTien()){
                b.display();
                break;
            }
            else{
                System.out.println("Khong co sach phu hop.");
                break;
            }
        }

    }

    public static void sapXepTheoGiaTien(Book[] book){
        Arrays.sort(book, Comparator.comparingDouble(Book::getGiaTien));
        System.out.println("Danh sach sau khi sap xep theo gia tien:");
        for (Book b : book) {
            b.display();
        }
    }

    public static void sapXepTheoTen(Book[] book){
        Arrays.sort(book, Comparator.comparing(Book::getTenSach));
        System.out.println("Danh sach sau khi sap xep theo ten:");
        for (Book b : book) {
            b.display();
        }
    }

}
