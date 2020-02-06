package luongnhanvien;
import java.util.*;
public class NhanVien {
	private String ten;
	private long luong;
	Scanner scanner=new Scanner(System.in);
	public NhanVien() {
		
	}
	public NhanVien(String ten, long luong) {
		this.ten = ten;
		this.luong = luong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public long getLuong() {
		return luong;
	}
	public void setLuong(long luong) {
		this.luong = luong;
	}
	public void nhap() {
		System.out.println("Nhap ten: ");
		ten=scanner.nextLine();
	}
	public void tinhLuong() {
	}
	public String xuat() {
	return "Ten nhan vien: " + this.ten + ", luong: " + 
	            this.luong + " VND";
	}
	
	
	
	
}
