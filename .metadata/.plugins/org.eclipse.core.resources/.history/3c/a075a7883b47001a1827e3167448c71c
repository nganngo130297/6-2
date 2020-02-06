package dahinh;
import java.util.*;
@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		int n,m;
		NhanVien nhanVien;
		ArrayList<NhanVien> arrNhanVien = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap so nhan vien toan thoi gian: ");
		n=scanner.nextInt();
		System.out.println("Nhap so nhan vien thoi vu: ");
		m=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin nhan vien toan thoi gian thu "+(i+1));
			nhanVien = new NhanVienTTG();  
            nhanVien.nhapNhanVien();
            arrNhanVien.add(nhanVien);
		}
		for(int i=0;i<m;i++) {
			System.out.println("Nhap thong tin nhan vien thoi vu thu "+(i+1));
			nhanVien = new NhanVienThoiVu();   
            nhanVien.nhapNhanVien();
            arrNhanVien.add(nhanVien);
		}

		for (NhanVien nv : arrNhanVien) {
            nv.tinhLuong();
            System.out.println(nv.toString());
        }
	}
}
