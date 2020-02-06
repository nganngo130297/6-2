package dahinh;
import java.util.*;
@SuppressWarnings("unused")
public class NhanVienThoiVu extends NhanVien{
	private int soGioLamThem;
	public static final long luongMoiGio=100000;
	
	public NhanVienThoiVu() {
		super();
	}
	public NhanVienThoiVu(int soGioLamThem) {
		super();
		this.soGioLamThem = soGioLamThem;
	}
	public int getSoGioLamThem() {
		return soGioLamThem;
	}
	public void setSoGioLamThem(int soGioLamThem) {
		this.soGioLamThem = soGioLamThem;
	}
	public static long getLuongmoigio() {
		return luongMoiGio;
	}
	public void nhapNhanVien() {
		Scanner scanner=new Scanner(System.in);
		super.nhapNhanVien();
		System.out.println("Nhap so gio lam them: ");
		soGioLamThem=scanner.nextInt();
	}
	public void tinhLuong() {	
		luong=luongMoiGio*this.soGioLamThem;
		
	}
	@Override
	public String toString() {
        return super.toString()+", So gio lam them: " + 
            this.soGioLamThem+"luong"+luong;
    }
	
	
	
}
