package quanlynhanvien;
import java.util.*;
public class NhanVien {
	private String ho;
	private String Ten;
	private int soSP;
	private double luong;
	
	public NhanVien() {
		
	}
	public NhanVien(String ho, String ten, int soSP) {
		this.ho = ho;
		Ten = ten;
		if(soSP<0)
			this.soSP =	0;
		else 
			this.soSP = soSP;
	}
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public int getSoSP() {
		return soSP;
	}
	public void setSoSP(int soSP) {
		this.soSP = soSP;
	}
	public double getLuong() {
		if(getSoSP()>=1 && getSoSP()<=199)
			luong=getSoSP()*0.5;
		if(getSoSP()>=200 && getSoSP()<=399)
			luong=getSoSP()*0.55;
		if(getSoSP()>=400 && getSoSP()<=599)
			luong=getSoSP()*0.6;
		if(getSoSP()>=600)
			luong=getSoSP()*0.65;
		return luong;
	}
	public void nhapNhanVien() {
		Scanner scanner= new Scanner(System.in); 
		System.out.println("Nhap ho:");
		ho=scanner.nextLine();
		System.out.println("Nhap ten:");
		Ten=scanner.nextLine();
		System.out.println("So san pham:");
		soSP=scanner.nextInt();
	}
	public void xuatNhanVien() {
		Scanner scanner= new Scanner(System.in); 
		System.out.println("ho: "+ho);
		System.out.println("ten: "+Ten);
		System.out.println("soSP:"+soSP);
	}
	
	
	
}
