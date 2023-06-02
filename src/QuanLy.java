import java.util.ArrayList;

public class QuanLy {
    ArrayList<TheoGio> dsTheoGio;
    ArrayList<TheoNgay> dsTheoNgay;

    public void QuanLy(){

    }
    public QuanLy(){
        dsTheoGio = new ArrayList<>();
        dsTheoNgay = new ArrayList<>();
    }

    public void ThemHoaDonTheoGio(String maHoaDon, String ngayHoaDon, String tenKH, String maPhong, double donGia, int soGioThue){
        TheoGio theoGio = new TheoGio(maHoaDon, ngayHoaDon, tenKH, maPhong, donGia, soGioThue);
        dsTheoGio.add(theoGio);
    }
    public void ThemHoaDonTheoNgay(String maHoaDon, String ngayHoaDon, String tenKH, String maPhong, double donGia, int soNgayThue){
        TheoNgay theoNgay = new TheoNgay(maHoaDon, ngayHoaDon, tenKH, maPhong, donGia, soNgayThue);
        dsTheoNgay.add(theoNgay);
    }
    public void XuatHoaDonTheoGio(){
        for (int i = 0; i <dsTheoGio.size(); i++){
            System.out.println(dsTheoGio.get(i).HienThiThueGio());
        }
    }
    public void XuatHoaDonTheoNgay(){
        for (int i = 0; i <dsTheoNgay.size(); i++){
            System.out.println(dsTheoNgay.get(i).HienThiThueNgay());
        }
    }
    public int TongSoLuongNghiGio(){
        int tongsogio = 0;
        for (int i = 0; i <dsTheoGio.size(); i++){
            tongsogio = tongsogio + dsTheoGio.get(i).getSoGioThue();
        }
        return tongsogio;
    }
    public int TongSoLuongNghiNgay(){
        int tongsongay = 0;
        for (int i = 0; i <dsTheoNgay.size(); i++){
            tongsongay = tongsongay + dsTheoNgay.get(i).getSoNgayThue();
        }
        return tongsongay;
    }
    public double TrungBinhTienThueNgayThang9Nam2013(){
        double tongtien = 0;
        int count = 0;
        for (int i = 0; i <dsTheoNgay.size(); i++){
            String hoadonthang9nam2013 = dsTheoNgay.get(i).getNgayHoaDon();
            String[] path = hoadonthang9nam2013.split("/");
            if (path[1].equals("09") && path[2].equals("2013")){
                tongtien = tongtien + dsTheoNgay.get(i).ThanhTienThueTheoNgay();
                count++;
            }
        }
        return tongtien/count;
    }
    public double TrungBinhTienThueGioThang9Nam2013(){
        double tongtien = 0;
        int count = 0;
        for (int i = 0; i <dsTheoGio.size(); i++){
            String hoadonthang9nam2013 = dsTheoGio.get(i).getNgayHoaDon();
            String[] path = hoadonthang9nam2013.split("/");
            if (path[1].equals("09") && path[2].equals("2013")){
                tongtien = tongtien + dsTheoGio.get(i).ThanhTienThueGio();
                count++;
            }
        }
        return tongtien/count;
    }
}
