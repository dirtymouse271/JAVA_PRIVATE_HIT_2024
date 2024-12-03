package service.impl;

import model.Account;
import model.Address;
import model.Role;
import model.Status;
import service.IAuthService;

import java.util.ArrayList;
import java.util.Scanner;

public class IAuthServiceImpl implements IAuthService {
    private ArrayList<Account> accList = new ArrayList<>();
    private Account curAcc;

    public IAuthServiceImpl(ArrayList<Account> accList) {
        this.accList = accList;
    }

    public IAuthServiceImpl(Account curAcc) {
        this.curAcc = curAcc;
    }

    public Account getCurAcc() {
        return curAcc;
    }

    public void setCurAcc(Account curAcc) {
        this.curAcc = curAcc;
    }

    Scanner sc = new Scanner(System.in);

    public IAuthServiceImpl() {
        accList.add(new Account("1","PhamDucThanh",19,new Address("CamKhe","PhuTho"),"27/10/2005","admin","12345", Role.ADMIN, Status.ACTIVE));
        accList.add(new Account("2","PhamThanh",19,new Address("Khu2","PhuTho"),"27/01/2005","user","12345", Role.USER, Status.ACTIVE));
    }

    @Override
    public void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        for(Account acc : accList){
            if(acc.getUsername().equals(username) && acc.getPassword().equals(password)){
                System.out.println("Login successfully!");
                curAcc = acc;
                return;
            }
        }
        System.out.println("Invalid username or password!");
    }

    @Override
    public void logout() {
        if(curAcc != null){
            curAcc = null;
            System.out.println("Logout successfully!");
        }
        System.out.println("No user currently!");
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        Account acc = new Account();
        System.out.println("Enter username: ");
        username = sc.nextLine();
        System.out.println("Enter password: ");
        oldPassword = sc.nextLine();
        if(acc.getUsername().equals(username) && acc.getPassword().equals(oldPassword)){
            System.out.print("Old password is: "+ acc.getPassword());
            System.out.print("Enter new password: ");
            acc.setPassword(newPassword);
            System.out.print("New password is: "+ newPassword);
        }
    }
}
