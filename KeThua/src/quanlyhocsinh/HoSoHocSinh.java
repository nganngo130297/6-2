package quanlyhocsinh;
import java.util.*;

public class HoSoHocSinh {
	private String lop;
	private Nguoi nguoi;
	public HoSoHocSinh() {
		
	}
	public HoSoHocSinh(String lop, Nguoi nguoi) {
		this.lop = lop;
		this.nguoi = nguoi;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public Nguoi getNguoi() {
		return nguoi;
	}
	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}
	public void nhapHS() {
		nguoi=new Nguoi();
		Scanner scanner=new Scanner(System.in);
		nguoi.nhapNguoi();
		System.out.println("Nhap lop:");
		lop=scanner.nextLine();
	}
	public void xuatHS() {
		nguoi.xuatNguoi();
		System.out.println("lop: "+lop);
	}
	
	
}

