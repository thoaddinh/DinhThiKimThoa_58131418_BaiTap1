
package BaiTap1;

public class GiaoVien extends CaNhan{
    private String boMon;
    private String toBoMon;

    public GiaoVien(String boMon, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.boMon = boMon;
        this.toBoMon = toBoMon;
    }
    
    public String getBoMon() {
        return boMon;
    }

    public void setBoMon(String boMon) {
        this.boMon = boMon;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()+" ,Bộ môn: "+getBoMon()+" ,Tổ bộ môn: "+getToBoMon(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
