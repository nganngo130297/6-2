package bienlai;
import java.util.*;

public class BienLai {
	private int chiSoCu;
    private int chiSoMoi;
    private double soTienPhaiTra;
    private KhachHang khachHang;
    
	public BienLai() {
	
	}
	public BienLai(int chiSoCu, int chiSoMoi, double soTienPhaiTra, KhachHang khachHang) {
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.soTienPhaiTra = soTienPhaiTra;
		this.khachHang = khachHang;
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public double getSoTienPhaiTra() {
		return soTienPhaiTra;
	}
	public void setSoTienPhaiTra(double soTienPhaiTra) {
		this.soTienPhaiTra = soTienPhaiTra;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public void nhapBienLai() {
		Scanner scanner= new Scanner(System.in);
		khachHang=new KhachHang();
		khachHang.nhapKhachHang();
		do {
			System.out.println("chi so cu: ");
			chiSoCu=scanner.nextInt();
			System.out.println("chi so moi: ");
			chiSoMoi=scanner.nextInt();
		}while(chiSoCu>chiSoMoi);
		soTienPhaiTra=(chiSoMoi-chiSoCu)*750;
		
	}
	public void xuatBienLai() {
		khachHang.xuatKhachHang();
		System.out.println("Chi so cu: "+chiSoCu);
		System.out.println("Chi so moi: "+chiSoMoi);
		System.out.println("So tien phai tra: "+soTienPhaiTra);
	}
	
}
	

