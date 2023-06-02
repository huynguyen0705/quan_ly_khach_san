import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Chuong trinh quan ly khach san");
            System.out.println("1. Nhap xuat danh sach cac hoa don");
            System.out.println("2. Tinh tong so luong cho tung loai");
            System.out.println("3. Tinh trung binh thanh tien hoa don thue phong thang 9/2013");
            System.out.println("4. Xuat hoa don");
            System.out.println("Vui long nhap lua chon: ");
            int input = scanner.nextInt();
            if (input < 1 || input > 4) {
                System.out.println("Nhap khong hop le");
            }
            switch (input) {
                case 1:
                    System.out.println("1. Nhap hoa don khach thue theo gio");
                    System.out.println("2. Nhap hoa don khach thue theo ngay");
                    int input1 = scanner.nextInt();
                    if (input1 < 1 || input1 > 2) {
                        System.out.println("Chon khong hop le");
                    }
                    switch (input1) {
                        case 1:
                            System.out.println("Nhap ma hoa don: ");
                            Scanner scanner1 = new Scanner(System.in);
                            String maHoaDon = scanner1.next();
                            System.out.println("Nhap ngay ra hoa don: ");
                            Scanner scanner2 = new Scanner(System.in);
                            String ngayHoaDon = scanner2.next();
                            System.out.println("Nhap ten khach hang: ");
                            Scanner scanner3 = new Scanner(System.in);
                            String tenKH = scanner3.next();
                            System.out.println("Nhap ma phong: ");
                            Scanner scanner4 = new Scanner(System.in);
                            String maPhong = scanner4.next();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner5 = new Scanner(System.in);
                            double donGia = scanner5.nextDouble();
                            System.out.println("Nhap so gio thue: ");
                            Scanner scanner6 = new Scanner(System.in);
                            int soGioThue = scanner6.nextInt();
                            quanLy.ThemHoaDonTheoGio(maHoaDon, ngayHoaDon, tenKH, maPhong, donGia, soGioThue);
                            break;

                        case 2:
                            System.out.println("Nhap ma hoa don: ");
                            Scanner scanner7 = new Scanner(System.in);
                            String maHoaDon1 = scanner7.next();
                            System.out.println("Nhap ngay ra hoa don: ");
                            Scanner scanner8 = new Scanner(System.in);
                            String ngayHoaDon1 = scanner8.next();
                            System.out.println("Nhap ten khach hang: ");
                            Scanner scanner9 = new Scanner(System.in);
                            String tenKH1 = scanner9.next();
                            System.out.println("Nhap ma phong: ");
                            Scanner scanner10 = new Scanner(System.in);
                            String maPhong1 = scanner10.next();
                            System.out.println("Nhap don gia: ");
                            Scanner scanner11 = new Scanner(System.in);
                            double donGia1 = scanner11.nextDouble();
                            System.out.println("Nhap so gio thue: ");
                            Scanner scanner12 = new Scanner(System.in);
                            int soNgayThue = scanner12.nextInt();
                            quanLy.ThemHoaDonTheoNgay(maHoaDon1, ngayHoaDon1, tenKH1, maPhong1, donGia1, soNgayThue);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Tong so luong khach thue phong:");
                    System.out.println("Khach thue gio: " + quanLy.TongSoLuongNghiGio());
                    System.out.println("Khach thue ngay: " + quanLy.TongSoLuongNghiNgay());
                    break;
                case 3:
                    System.out.println("Tong trung binh tien khach thue phong thang 9 nam 2013:");
                    System.out.println("Khach thue gio: " + quanLy.TrungBinhTienThueGioThang9Nam2013());

                    System.out.println("Khach thue ngay: ");
                    quanLy.TrungBinhTienThueNgayThang9Nam2013();
                    break;
                case 4:
                    System.out.println("Hoa don:");
                    quanLy.XuatHoaDonTheoGio();
            }
        }
    }
}