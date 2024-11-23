import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    Scanner sc = new Scanner(System.in);

    public Student() {
    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public float getCriteria() {
        return criteria;
    }

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        System.out.println("Nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten lop: ");
        nameClass = sc.nextLine();
        System.out.println("Nhap gpa: ");
        gpa = sc.nextFloat();
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "id=" + id +
                ", nameClass='" + nameClass + '\'' +
                ", gpa=" + gpa +
                ", criteria=" + criteria +
                '}';
    }

    @Override
    public void output() {
        super.output();
        System.out.println(toString());
    }

    public boolean checkFall(){
        return this.gpa < criteria;
    }
}
