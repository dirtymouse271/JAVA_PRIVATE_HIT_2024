package service.impl;

import model.Account;
import model.Address;
import model.Role;
import model.Status;
import service.IAccountService;

import java.util.List;
import java.util.Scanner;

public class IAccountServiceImpl implements IAccountService {
    Scanner sc = new Scanner(System.in);

    @Override
    public List<Account> getAllAccount() {

        return List.of();
    }

    @Override
    public void createNewAccount(Account account) {
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        account.setId(id);
        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();
        account.setFullName(fullName);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        account.setAge(age);
        System.out.println("Enter address: ");
        Address address = new Address(sc.nextLine(),sc.nextLine());
        account.setAddress(address);
        System.out.println("Enter birthday: ");
        String birthday = sc.nextLine();
        account.setBirthday(birthday);
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        account.setUsername(username);
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        account.setPassword(password);
        System.out.println("Enter role: ");
        Role role = Role.valueOf(sc.nextLine());
        account.setRole(role);
        System.out.println("Enter status: ");
        Status status = Status.valueOf(sc.nextLine());
        account.setStatus(status);
    }

    @Override
    public Account getAccountByUsername(String username) {
        Account acc = new Account();
        if(acc.getUsername().equals(username)){
            acc.display();
            return acc;
        }
        return null;
    }

    @Override
    public void deleteAccount(String username) {
        Account acc = new Account();
        if(acc.getUsername().equals(username)){
            String password = sc.nextLine();
            if(acc.getPassword().equals(password)){

            }
        }
    }

    @Override
    public void changeStatus(String username, Status status) {

    }
}
