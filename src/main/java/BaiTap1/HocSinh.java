    
package BaiTap1;

public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;
    
    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }

    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt) {
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String HienThiTT() {
        return super.HienThiTT()+" ,Lớp: "+getLop()+" ,Năng khiếu: "+getNangKhieu(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
