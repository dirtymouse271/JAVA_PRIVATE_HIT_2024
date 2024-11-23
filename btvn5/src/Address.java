import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input(Scanner sc){
        System.out.println("Nhap phuong/xa: ");
        commune = sc.nextLine();
        System.out.println("Nhap quan/huyen: ");
        district = sc.nextLine();
        System.out.println("Nhap tinh/thanh pho: ");
        city = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Address{" +
                "commune='" + commune + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public void output(){
        System.out.println(toString());
    }
}
