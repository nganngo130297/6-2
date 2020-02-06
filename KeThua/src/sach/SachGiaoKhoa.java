package sach;
import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
	private int tinhTrang;

	public SachGiaoKhoa() {
		super();	
	}
	public SachGiaoKhoa(int tinhTrang) {
		super();
		this.tinhTrang = tinhTrang;
	}
	public int getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(int tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public void nhapSachGiaoKhoa() {
		Scanner scanner= new Scanner(System.in);
		super.nhapSach();
		System.out.println("Nhap tinh trang (1-moi,2-cu): ");
		tinhTrang=scanner.nextInt();
	}
	public void xuatSachGiaoKhoa() {
		super.xuatSach();
		System.out.println("Tinh trang: "+tinhTrang);
	}
}
