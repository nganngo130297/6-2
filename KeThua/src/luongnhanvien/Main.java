package luongnhanvien;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int soNhanVienToanThoiGian, soNhanVienThoiVu;
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien;
        ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
         
        System.out.print("so nhan vien toan thoi gian: ");
        soNhanVienToanThoiGian = scanner.nextInt();
        System.out.println("THONG TIN NHAN VIEN TOAN THOI GIAN");
        for (int i = 0; i < soNhanVienToanThoiGian; i++) {
            System.out.println("nhap nhan vien toan thoi gian thu " + (i + 1) + ": ");
            nhanVien = new NhanVienToanThoiGian();  
            nhanVien.nhap();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.print("so nhan vien thoi vu: ");
        soNhanVienThoiVu = scanner.nextInt();
        System.out.println("THONG TIN NHAN VIEN THOI VU");
        for (int i = 0; i < soNhanVienThoiVu; i++) {
            System.out.println("nhap thong tin nhan vien thoi vu thu " + (i + 1) + ": ");
            nhanVien = new NhanVienBanThoiGian();    
            nhanVien.nhap();
            arrNhanVien.add(nhanVien);
        }
         
        System.out.println("THONG TIN NHAN VIEN");
        for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.getTen());
        }
    }

}
