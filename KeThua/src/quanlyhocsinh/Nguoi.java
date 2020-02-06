package quanlyhocsinh;
import java.util.*;
public class Nguoi {
	private String hoTen;
	private String gioiTinh;
	private String queQuan;
	public Nguoi() {
		
	}
	public Nguoi(String hoTen, String gioiTinh, String queQuan) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public void nhapNguoi() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap ho ten:");
		hoTen=scanner.nextLine();
		System.out.println("Nhap gio tinh:");
		gioiTinh=scanner.nextLine();
		System.out.println("Nhap que quan:");
		queQuan=scanner.nextLine();
	}
	public void xuatNguoi() {
		 System.out.println("name: " + hoTen);
	        System.out.println("gioi tinh: " + gioiTinh);
	        System.out.println("Que quan: " + queQuan);
	}
	public static void main( String[] args) {
		Nguoi nguoi=new Nguoi();
		System.out.println("xuat");
		nguoi.nhapNguoi();
		nguoi.xuatNguoi();
	}
	
}
