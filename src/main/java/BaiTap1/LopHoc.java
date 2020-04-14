
package BaiTap1;

import java.util.ArrayList;

public class LopHoc {
    ArrayList<HocSinh> hocSinhs = new ArrayList<>();
    ArrayList<GiaoVien> giaoViens = new ArrayList<>();
    
    public int themHocSinh(HocSinh hs){
       hocSinhs.add(hs);
       return hocSinhs.size();
   }
    
   public int themGVGD(GiaoVien gv){
       giaoViens.add(gv);
       return giaoViens.size();
   }
   
   public int inDSHS(){
       int i = 1;
       for (HocSinh hs: hocSinhs){
           System.out.println("------------------------");
           System.out.println("--------Học sinh "+i+" --------------");
           System.out.println(hs.HienThiTT());
           i++;
       }
       return 0;
   }
   public int inDSGVGD(){
       int j = 1;
       for (GiaoVien gv : giaoViens){
           System.out.println("------------------------");
           System.out.println("--------Giáo viên "+j+" --------------");
           System.out.println(gv.HienThiTT());
           j++;
       }
       return 0;
   }
}
