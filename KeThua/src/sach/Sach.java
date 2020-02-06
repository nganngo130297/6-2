package sach;
import java.util.Scanner;

public class Sach {
	private String maSach;
	private double gia;
	private int soLuong;
	private String nhaXB;
	
	public Sach(){
	}
	public Sach(String maSach, double gia, int soLuong, String nhaXB) {
		this.maSach = maSach;
		this.gia = gia;
		this.soLuong = soLuong;
		this.nhaXB = nhaXB;
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	public void nhapSach() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Nhap ma sach: ");
		maSach=scanner.nextLine();
		System.out.println("Nhap nha xuat ban: ");
		nhaXB=scanner.nextLine();
		System.out.println("Nhap gia: ");
		gia=scanner.nextInt();
		System.out.println("Nhap so luong: ");
		soLuong=scanner.nextInt();
		
	}
	public void xuatSach() {
		System.out.println("Ma sach: "+maSach);
		System.out.println("Gia: "+gia);
		System.out.println("SL: "+soLuong);
		System.out.println("NXB: "+nhaXB);
	}
}
