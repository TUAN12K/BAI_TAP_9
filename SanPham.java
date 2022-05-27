package BAI_TAP_9;

public class SanPham {
    private String maSP;
    private String ten;
    private int khoiLuong;
    private String loaiSP;

    public SanPham() {
    }

    public SanPham(String maSP, String ten, int khoiLuong, String loaiSP) {
        this.maSP = maSP;
        this.ten = ten;
        this.khoiLuong = khoiLuong;
        this.loaiSP = loaiSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
    
    
    public Object[] toDataRow(){
        return new Object[]{maSP, ten, khoiLuong, loaiSP};
    }
}
