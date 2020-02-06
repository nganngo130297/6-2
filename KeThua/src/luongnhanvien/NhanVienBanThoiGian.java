package luongnhanvien;
import java.util.*;
public class NhanVienBanThoiGian extends NhanVien{
	private static long LUONG_THOI_VU=100000;
	private int songaylamthem;
	Scanner scanner=new Scanner(System.in);
	public NhanVienBanThoiGian() {
		super();
	}
	public NhanVienBanThoiGian(int songaylamthem) {
		super();
		this.songaylamthem = songaylamthem;
	}
	public int getSongaylamthem() {
		return songaylamthem;
	}
	public void setSongaylamthem(int songaylamthem) {
		this.songaylamthem = songaylamthem;
	}
	public void nhap() {
		super.nhap();
		System.out.println("so ngay lam them: ");
		songaylamthem=scanner.nextInt();
	}
	public void tinhTien() {
		System.out.println("so tien:"+(LUONG_THOI_VU*songaylamthem));
	}
	public String xuat() {
		return super.xuat()+"so ngay lam them"+songaylamthem;
	}
	

	
}
