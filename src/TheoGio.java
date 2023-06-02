public class TheoGio extends KhachSan{
    int SoGioThue;
    TheoNgay theoNgay;
    public int getSoGioThue() {
        return SoGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        SoGioThue = soGioThue;
    }
    public TheoGio(String maHoaDon, String ngayHoaDon, String tenKH, String maPhong, double donGia, int soGioThue){
        setMaHoaDon(maHoaDon);
        setNgayHoaDon(ngayHoaDon);
        setTenKH(tenKH);
        setMaPhong(maPhong);
        setDonGia(donGia);
        setSoGioThue(soGioThue);
    }
    public String HienThiThueGio(){
        System.out.println("Ma hoa don: " + getMaHoaDon());
        System.out.println("Ngay hoa don: " +getNgayHoaDon());
        System.out.println("Ten KH: " +getTenKH());
        System.out.println("Ma phong: "+getMaPhong());
        System.out.println("Don gia: "+getDonGia());
        System.out.println("So gio thue: "+getSoGioThue());
        return "-----------";
    }
    public double ThanhTienThueGio(){
        int sogiothue = getSoGioThue();
        double thanhtien = 0;
            if (sogiothue < 24){
                thanhtien = getSoGioThue() * getDonGia();
            }else if (sogiothue > 24 && sogiothue <30){
                thanhtien = 24 * getDonGia();
            }else if (sogiothue > 30){
                double songaythuequa30t = getSoGioThue() / 24;
                if (songaythuequa30t < 7){
                    thanhtien = songaythuequa30t * getDonGia();
                }else if (songaythuequa30t > 7){
                    double songaythuequa7 = songaythuequa30t - 7;
                    thanhtien = (7 * getDonGia()) + (songaythuequa7 * getDonGia() * 80 / 100);
                }
            }
            return thanhtien;
    }
}
