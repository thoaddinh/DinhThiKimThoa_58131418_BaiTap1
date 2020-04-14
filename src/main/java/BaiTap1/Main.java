
package BaiTap1;

public class Main {

    public static void main(String[] args) {
        
        HocSinh hs1 = new HocSinh("58CNTT1", "java", "Dinh Thi Kim Thoa", 22, "Khanh Hoa", "12345678");
        HocSinh hs2 = new HocSinh("58CNTT2", "C#", "Pham Thi Thu", 22, "Khanh Hoa", "4342353434");
        HocSinh hs3 = new HocSinh("58CNTT1", "C++", "Nguyen Hoang", 22, "Khanh Hoa", "12345678");
        HocSinh hs4 = new HocSinh("58CNTT2", "Js", "Nguyen Thanh", 22, "Khanh Hoa", "4342353434");
      
        GiaoVien gv1 = new GiaoVien("Nhap mon lap trinh", "CNPM", "Nguyen Van A", 40, "Khanh Hoa", "46483823");
        GiaoVien gv2 = new GiaoVien("Mau thiết kế", "CNPM", "Nguyen Van B", 35, "Khanh Hoa", "343928438");
        GiaoVien gv3 = new GiaoVien("Lâp trình nhúng", "CNPM", "Nguyen Van C", 40, "Khanh Hoa", "46483823");
        GiaoVien gv4 = new GiaoVien("Chuyen mạng", "CNPM", "Nguyen Van D", 35, "Khanh Hoa", "343928438");
        
        LopHoc lophoc = new LopHoc();
        lophoc.themHocSinh(hs1);
        lophoc.themHocSinh(hs2);
        lophoc.themHocSinh(hs3);
        lophoc.themHocSinh(hs4);
        
        lophoc.themGVGD(gv1);
        lophoc.themGVGD(gv2);
        lophoc.themGVGD(gv3);
        lophoc.themGVGD(gv4);
    
        System.out.println(lophoc.inDSHS());
        
        System.out.println(lophoc.inDSGVGD());
        
    }
}
