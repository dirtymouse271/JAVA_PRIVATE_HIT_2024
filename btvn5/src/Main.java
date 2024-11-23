import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        while (true) {
            System.out.println("1. Nhap thong tin");
            System.out.println("2. In ra thong tin");
            System.out.println("3. Sap xep theo gpa");
            System.out.println("4. Xoa theo id");
            System.out.println("5. Kiem tra do/truot");
            System.out.println("6. Thoat");
            System.out.println("Nhap lua chon");
            select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    ClassRoom.inputList(sc);
                    break;
                case 2:
                    ClassRoom.outputList();
                    break;
                case 3:
                    ClassRoom.sortByGpa();
                    break;
                case 4:
                    ClassRoom.removeById(sc);
                    break;
                case 5:
                    System.out.println("Nhap id can kiem tra");
                    int idIndex2 = sc.nextInt();
                    sc.nextLine();
                    if (ClassRoom.findFail(idIndex2)) {
                        System.out.println("Sinh vien nay do");
                    } else {
                        System.out.println("Sinh vien nay truot");
                    }
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Nhap khong hop le");
                    break;

            }
        }
    }
}
