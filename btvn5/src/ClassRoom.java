import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    static ArrayList<Student> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public static void sortByGpa() {
        list.sort(Comparator.comparing(Student::getGpa));
    }

    public static void inputList(Scanner sc) {
        System.out.println("Nhap so luong sinh vien muon them:");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            Student student = new Student();
            student.input(sc);
            list.add(student);
        }
    }

    public static void outputList() {
        for (Student st : list) {
            st.output();
        }
    }

    public static boolean removeById(Scanner sc) {
        System.out.println("Nhap id can xoa: ");
        int idcanxoa = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idcanxoa) {
                list.remove(i);
                System.out.println("Da xoa sinh vien co ID: " + idcanxoa);
                return true;
            }
        }
        System.out.println("Khong co sinh vien can tim.");
        return false;
    }
    public static boolean findFail(int id) {
        for (Student student : list) {
            if (student.getId() == id) {
                return student.checkFall();
            }
        }
        return false;
    }
}

