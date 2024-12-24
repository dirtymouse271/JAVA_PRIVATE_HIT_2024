package UI;

import model.PhysicalProduct;
import model.Product;
import model.Role;
import model.User;
import service.impl.IUserServiceImpl;
import service.impl.IProductManagerImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        IProductManagerImpl productPM = new IProductManagerImpl();
        IUserServiceImpl userPM = new IUserServiceImpl();

        userPM.login(sc);

        if (userPM.getCurrentUser().getRole().equals(Role.ADMIN)) {
            while(true){
                System.out.println("======= Quản Lý Sản Phẩm (Admin) =======");
                System.out.println("1. Thêm sản phẩm");
                System.out.println("2. Hiện thị danh sách sản phẩm");
                System.out.println("3. Tìm kiếm sản phẩm theo tên");
                System.out.println("4. Xóa sản phẩm theo mã");
                System.out.println("5. Cập nhật thông tin sản phẩm");
                System.out.println("6. Thoát");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        if (productPM.addProduct(sc)) System.out.println("Thêm thành công");
                        else System.out.println("Thêm thất bại");
                        break;
                    case 2:
                        productPM.displayAll();
                        break;
                    case 3:
                        System.out.println("Nhập tên sản phẩm cần tìm: ");
                        if(productPM.searchProduct(sc)) System.out.println("Tìm thành công");
                        else System.out.println("Tìm thất bại");
                        break;
                    case 4:
                        System.out.println("Nhập mã sản phẩm cần xóa: ");
                        if (productPM.deleteProduct(sc)) System.out.println("Xóa thành công");
                        else System.out.println("Xóa thất bại");
                        break;
                    case 5:
                        System.out.println("Nhập mã sản phẩm cần cập nhật: ");
                        if(productPM.updateProduct(sc)) System.out.println("Cập nhật thành công");
                        else System.out.println("Cập nhật thất bại");
                        break;
                    case 6:
                        userPM.logout();
                        System.out.println("Đăng xuất thành công");
                        System.exit(0);
                        System.exit(0);
                        break;
                }
            }
        }
        else{
            while(true){
                System.out.println("======= Xem Sản Phẩm (User) =======");
                System.out.println("1. Hiện thị danh sách sản phẩm");
                System.out.println("2. Tìm kiếm sản phẩm theo tên");
                System.out.println("3. Thoát");
                System.out.println("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice){
                    case 1:
                        productPM.displayAll();
                        break;
                    case 2:
                        System.out.println("Nhập tên sản phẩm cần tìm: ");
                        if(productPM.searchProduct(sc)) System.out.println("Tìm thành công");
                        else System.out.println("Tìm thất bại");
                        break;
                    case 3:
                        userPM.logout();
                        System.out.println("Đăng xuất thành công");
                        System.exit(0);
                        System.exit(0);
                        break;
                }
            }
        }


    }

}
