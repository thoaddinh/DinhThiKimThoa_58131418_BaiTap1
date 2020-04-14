
package BaiTap1;

import java.util.ArrayList;

public class QLDS implements IQLDS {
    ArrayList<CaNhan> caNhans = new ArrayList<>();
    @Override
    public int them(CaNhan p) {
        caNhans.add(p);
        return caNhans.size();
    }

    @Override
    public int xoa(String ten) {
        for(int i=0; i <caNhans.size(); i++){
            if(caNhans.get(i).getHoTen().equals(ten))
                caNhans.remove(i);
        }
        return caNhans.size();
    }

    @Override
    public void inDS() {
         for(int i=0; i<caNhans.size(); i++){
             caNhans.get(i).HienThiTT();
         }
    }
   
}
