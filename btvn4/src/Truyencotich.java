public class Truyencotich extends Book{
    private String countryname;

    public Truyencotich() {
    }

    public Truyencotich(int maSach, String tenSach, Tacgia tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien, String countryname) {
        super(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien);
        this.countryname = countryname;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }
}
