package service.impl;

import service.IProductManager;
import model.User;
import java.util.ArrayList;
import java.util.Scanner;
import model.Role;
import model.Product;
import model.PhysicalProduct;

public class IProductManagerImpl implements IProductManager {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Product> productList = new ArrayList<>();

    @Override
    public boolean addProduct(Scanner scanner) throws Exception {
        PhysicalProduct product = new PhysicalProduct();
        try {
            System.out.println("Nhập id: ");
            String id = scanner.nextLine();
            for (Product pr : productList) {
                if (pr.getId().equals(id)) {
                    throw new Exception("Id đã tồn tại. Vui lòng nhập lại.");
                }
            }
        product.setId(id);
        }
        catch (Exception e) {
        System.out.println(e.getStackTrace());
        return false;
        }
        System.out.println("Nhập tên: ");
        product.setName(scanner.nextLine());
        System.out.println("Nhập giá: ");
        product.setPrice(scanner.nextFloat());
        System.out.println("Nhập số lượng: ");
        product.setQuantity(scanner.nextInt());
        productList.add(product);
        return true;
}


@Override
    public void displayAll() {
        for(Product pr : productList){
            System.out.println(pr.toString());
        }
    }

    @Override
    public boolean searchProduct(Scanner scanner) {
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        for(Product pr : productList){
            if(pr.getName().equals(name)){
                System.out.println(pr.toString());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Scanner scanner) {
        System.out.println("Enter product id: ");
        String id = scanner.nextLine();
        for (Product pr : productList) {
            if (pr.getId().equals(id)) {
                productList.remove(pr);
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean updateProduct(Scanner scanner) {
        System.out.println("Enter product id: ");
        String id = scanner.nextLine();
        for (Product pr : productList) {
            System.out.println("Nhập tên: ");
            pr.setName(scanner.nextLine());
            System.out.println("Nhập giá: ");
            pr.setPrice(scanner.nextFloat());
            System.out.println("Nhập số lượng: ");
            pr.setQuantity(scanner.nextInt());
            return true;
        }
        return false;
    }
}