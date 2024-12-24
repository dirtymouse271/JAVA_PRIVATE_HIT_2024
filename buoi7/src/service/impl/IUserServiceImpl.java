package service.impl;

import model.Product;
import model.Role;
import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.Scanner;

public class IUserServiceImpl implements IUserService {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<User> userList = new ArrayList<>();
    private User currentUser;

    public IUserServiceImpl() {
        userList.add(new User("1", "Pham Duc Thanh", "gloucester", "12345", Role.ADMIN));
        userList.add(new User("001", "User", "user", "123456", Role.USER));
        currentUser = null;
    }
    public User getCurrentUser() {
        return currentUser;
    }

    @Override
    public void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for (User user : userList) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successfully!");
                return;
            }
        }
        System.out.println("Invalid username or password!");
    }

    @Override
    public void logout() {
        if (currentUser != null) {
            System.out.println("Logout successfully!");
            currentUser = null;
        } else {
            System.out.println("No user is currently logged in!");
        }
    }

}

