package BAI_TAP_9;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    public List<SanPham> timTenSanPham(List<SanPham> lstSanPhams, String tenDv) {
        List<SanPham> lstSearch = new ArrayList<>();
        for (SanPham sanPham : lstSanPhams) {
            if (sanPham.getTen().toLowerCase().equals(tenDv.toLowerCase())) {
                lstSearch.add(sanPham);
            }
        }
        return lstSearch;
    }

    public void sapXep(List<SanPham> lstSanPhams) {
        lstSanPhams.sort((o1, o2) -> {
            return o1.getKhoiLuong() - o2.getKhoiLuong();
        });
    }
}
