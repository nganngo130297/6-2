package dahinh;
import java.util.*;
@SuppressWarnings("unused")
public class NhanVienTTG extends NhanVien{
	private int soNgayLamThem;
	private int loaiNhanVien;
	public static final long luongthangbt=10000000;
	public static final long luongthangsep=20000000;
	public static final long luonglamthem=80000;
	public NhanVienTTG() {
		super();
	}
	public NhanVienTTG(int soNgayLamThem, int loaiNhanVien) {
		super();
		this.soNgayLamThem = soNgayLamThem;
		this.loaiNhanVien = loaiNhanVien;
	}
	public int getSoNgayLamThem() {
		return soNgayLamThem;
	}
	public void setSoNgayLamThem(int soNgayLamThem) {
		this.soNgayLamThem = soNgayLamThem;
	}
	public int getLoaiNhanVien() {
		return loaiNhanVien;
	}
	public void setLoaiNhanVien(int loaiNhanVien) {
		this.loaiNhanVien = loaiNhanVien;
	}
	public static long getLuongthangbt() {
		return luongthangbt;
	}
	public static long getLuongthangsep() {
		return luongthangsep;
	}
	public static long getLuonglamthem() {
		return luonglamthem;
	}
	public void nhapNhanVien() {
		Scanner scanner=new Scanner(System.in);
		super.nhapNhanVien();
		System.out.println("Nhan vien binh thuong hay sep ? (1 - binh thuong, 2 - sep): ");
		loaiNhanVien=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap so ngay lam them: ");
		soNgayLamThem=scanner.nextInt();
	}
	public void tinhLuong() {
		if(loaiNhanVien==1) {
			luong=luongthangbt+luonglamthem*this.soNgayLamThem;
		}
		if(loaiNhanVien==2) {
			luong=luongthangsep+luonglamthem*this.soNgayLamThem;
		}
	}

	public String toString() {
        return super.toString() +", Loai nhan vien: " + this.loaiNhanVien + ", So ngay lam them: " +  this.soNgayLamThem +"luong"+luong;
    }
	
	
	
	
}
