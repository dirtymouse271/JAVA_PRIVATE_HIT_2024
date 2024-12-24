package service;

import model.User;
import java.util.Scanner;

public interface IUserService {
    public void display();
    public void addMember(User user);
    public void deleteMember(String id);
}
