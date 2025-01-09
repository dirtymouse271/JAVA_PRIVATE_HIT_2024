package model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCConnector {
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    private static String DRIVER;

    static {
        try (InputStream fis = JDBCConnector.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (fis == null) {
                throw new FileNotFoundException("File application.properties không tồn tại!");
            }
            Properties properties = new Properties();
            properties.load(fis);

            URL = properties.getProperty("datasource.url");
            USERNAME = properties.getProperty("datasource.username");
            PASSWORD = properties.getProperty("datasource.password");
            DRIVER = properties.getProperty("datasource.driver-class-name");

            Class.forName(DRIVER);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void main(String[] args) {
        try{
            Connection connection = getConnection();
            System.out.println("ket noi thanh cong");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void addproduct(Scanner scanner) throws SQLException {
        Connection connection = getConnection();
        System.out.println("Nhap id: ");
        int id = scanner.nextInt();
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap vi tri: ");
        String viTri = scanner.nextLine();
        System.out.println("Nhap luong: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhap ngay sa thai: ");
        String hireDate = scanner.nextLine();
//        String query = INSERT INTO
    }
}
