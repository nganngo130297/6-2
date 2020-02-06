package luongnhanvien;
import java.util.*;

public class NhanVienToanThoiGian extends NhanVien {
	private String loaiNhanVien;
	private int chon,songaylamthem;
	public static long THUONG_LUONG_TTG_BT=10000000;
	public static long THUONG_LUONG_TTG_SEP=20000000;
	public NhanVienToanThoiGian() {
		super();
	}
	public NhanVienToanThoiGian(String loaiNhanVien,int songaylamthem) {
		super();
		this.loaiNhanVien = loaiNhanVien;
		this.songaylamthem=songaylamthem;
	}
	public String getLoaiNhanVien() {
		return loaiNhanVien;
	}
	public void setLoaiNhanVien(String loaiNhanVien) {
		this.loaiNhanVien = loaiNhanVien;
	}
	public int getSongaylamthem() {
		return songaylamthem;
	}
	public void setSongaylamthem(int songaylamthem) {
		this.songaylamthem = songaylamthem;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap loai nhan vien: 1-thuong,2-sep");
		chon=scanner.nextInt();
		switch(chon) {
		case 1:
			loaiNhanVien="thuong";
			break;
		case 2:
			loaiNhanVien="sep";
			break;
		default: 
			System.out.println("Nhap sai loai nhan viên: ");
			break;
		}
		System.out.println("Nhap so ngay lam them: ");
		songaylamthem=scanner.nextInt();
	}
	public void tinhLuong() {
		if(chon==1) System.out.println(loaiNhanVien+"luong:"+(songaylamthem*800+THUONG_LUONG_TTG_SEP));
		else System.out.println(loaiNhanVien+"luong:"+(songaylamthem*800+THUONG_LUONG_TTG_BT));
	}
	public String xuat() {
		return super.xuat()+"loai nhan vien: "+loaiNhanVien+"songaylamthem: "+songaylamthem;
	}
	
}
