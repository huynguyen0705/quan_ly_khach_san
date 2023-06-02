public class TheoNgay extends KhachSan{
    int SoNgayThue;

    public int getSoNgayThue() {
        return SoNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        SoNgayThue = soNgayThue;
    }
    public TheoNgay(String maHoaDon, String ngayHoaDon, String tenKH, String maPhong, double donGia, int soNgayThue){
        setMaHoaDon(maHoaDon);
        setNgayHoaDon(ngayHoaDon);
        setTenKH(tenKH);
        setMaPhong(maPhong);
        setDonGia(donGia);
        setSoNgayThue(soNgayThue);
    }
    public String HienThiThueNgay(){
        System.out.println("Ma hoa don: " + getMaHoaDon());
        System.out.println("Ngay hoa don: " +getNgayHoaDon());
        System.out.println("Ten KH: " +getTenKH());
        System.out.println("Ma phong: "+getMaPhong());
        System.out.println("Don gia: "+getDonGia());
        System.out.println("So ngay thue: "+getSoNgayThue());
        return "-----------";
    }
    public double ThanhTienThueTheoNgay(){
        int songaythue = getSoNgayThue();
        double thanhtien = 0;
        if (songaythue < 7){
            thanhtien = getSoNgayThue() * getDonGia();
        }else if (songaythue > 7){
            int ngaythuequa7 = getSoNgayThue() - 7;
            thanhtien = (7 * getDonGia()) + (ngaythuequa7 * getDonGia() * 80 / 100);
        }
        return thanhtien;
    }
}
