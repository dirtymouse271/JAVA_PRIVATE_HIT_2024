package buoi4;

import java.util.Scanner;

public class Person {
    private String maCanCuocCongDan;
    private String ten;
    private int tuoi;
    private String diaChi;
    private String soDienThoai;

    Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(String maCanCuocCongDan, String ten, int tuoi, String diaChi, String soDienThoai) {
        this.maCanCuocCongDan = maCanCuocCongDan;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getMaCanCuocCongDan() {
        return maCanCuocCongDan;
    }

    public void setMaCanCuocCongDan(String maCanCuocCongDan) {
        this.maCanCuocCongDan = maCanCuocCongDan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void display(){
        System.out.println(maCanCuocCongDan);
        System.out.println(ten);
        System.out.println(tuoi);
        System.out.println(diaChi);
        System.out.println(soDienThoai);
    }

}

