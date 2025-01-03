import java.util.Scanner;

public class Book {
    protected int maSach;
    protected String tenSach;
    protected Tacgia tenTacGia;
    protected int namSanXuat;
    protected String tomTatNoiDung;
    protected double giaTien;

    Scanner scanner = new Scanner(System.in);


    public Book() {
    }

    public Book(int maSach, String tenSach, Tacgia tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Tacgia getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(Tacgia tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Book{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", tomTatNoiDung='" + tomTatNoiDung + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

    public void nhapSach(Scanner scanner){
        System.out.println("Nhap ma sach: ");
        maSach = scanner.nextInt();
        System.out.println("Nhap ten sach: ");
        scanner.nextLine();
        tenSach = scanner.nextLine();
        System.out.println("Nhap ten tac gia: ");
        tenTacGia.nhapten(scanner);
        System.out.println("Nhap nam san xuat : ");
        namSanXuat = scanner.nextInt();
        System.out.println("Nhap noi dung : ");
        tomTatNoiDung = scanner.next();
        System.out.println("Nhap gia tien : ");
        giaTien = scanner.nextInt();
    }
}
