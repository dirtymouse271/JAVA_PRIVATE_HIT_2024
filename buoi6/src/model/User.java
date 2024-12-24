package model;

import java.util.Scanner;

public class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private int age;
    private String birthday;
    private Role role;

    Scanner sc = new Scanner(System.in);

    public User() {
    }

    public User(String id, String name, String email, String password, int age, String birthday, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.birthday = birthday;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                ", role=" + role +
                ", sc=" + sc +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

}
