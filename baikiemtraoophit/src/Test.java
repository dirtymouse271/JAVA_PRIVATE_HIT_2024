import model.Account;
import model.Role;
import service.IAccountService;
import service.impl.IAccountServiceImpl;
import service.impl.IAuthServiceImpl;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        IAuthServiceImpl accList = new IAuthServiceImpl();
        accList.login(sc);
        if(acc.getRole().equals(Role.ADMIN)) {
            System.out.println("===== HE THONG QUAN LY TAI KHOAN =====");
            System.out.print("Xin chao ADMIN: ");
            System.out.println(accList.getCurAcc().getUsername());
            System.out.println("Chon mot trong cac chua nang sau: ");
            System.out.println("1, Xem danh sach tai khoan");
            System.out.println("2, Tao tai khoan moi");
            System.out.println("3, Tim kiem tai khoan theo username");
            System.out.println("4, Xoa tai khoan");
            System.out.println("5, Thay doi trang thai tai khoan");
            System.out.println("6, xem thong tin ca nhan");
            System.out.println("0, Dang xuat");
            System.out.println("-----------------------------------------------------");
            System.out.println("Nhap lua chon cua ban: ");

            int choice = sc.nextInt();
            while (true) {

                switch (choice) {
                    case 1:

                }
            }
        }

        else{

        }

    }
}
