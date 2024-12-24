package service.impl;

import model.Role;
import model.User;
import service.IUserService;

import java.util.ArrayList;
import java.util.Scanner;

public class IUserServiceImpl implements IUserService {
    private ArrayList<User> userList;
    private User currentUser;

    public IUserServiceImpl() {
        userList.add(new User("001", "Admin1", "a@gmail.com", "123", 14, "12323", Role.ADMIN));
        currentUser = null;
    }

    public void login(Scanner scanner) {
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        for (User user : userList) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                currentUser = user;
                System.out.println("Login successfully!");
                return;
            }
        }
        System.out.println("Invalid email or password!");
    }

    @Override
    public void display() {
        if (userList.isEmpty()) {
            System.out.println("No member found!");
        } else {
            System.out.println("Member list: ");
            for (User user : userList) {
                user.display();
            }
        }
    }

    @Override
    public void addMember(User user) {
        if(isAdmin()){
            userList.add()
            System.out.println("Only admin can add member!");
            return;
        }
    }

    @Override
    public void deleteMember(String id) {

    }

    private boolean isAdmin() {
        return currentUser != null && currentUser.getRole().equals(Role.ADMIN);
    }
}
