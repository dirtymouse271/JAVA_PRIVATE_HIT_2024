package service;

import java.util.Scanner;

public interface IProductManager {
    public boolean addProduct(Scanner scanner) throws Exception;
    public void displayAll();
    public boolean searchProduct(Scanner scanner);
    public boolean deleteProduct(Scanner scanner);
    public boolean updateProduct(Scanner scanner);
}
