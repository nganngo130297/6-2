package quanlychuyenxe;
import java.util.Scanner;

public class ChuyenXe {
	private String maSo;
	private String hoTenTX;
	private int soXe;
	private int doanhThu;
	
	public ChuyenXe() {
		super();
	}
	public ChuyenXe(String maSo, String hoTenTX, int soXe, int doanhThu ) {
		super();
		this.maSo=maSo;
		this.hoTenTX=hoTenTX;
		this.soXe=soXe;
		this.doanhThu=doanhThu;
	}
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getHoTenTX() {
		return hoTenTX;
	}
	public void setHoTenTX(String hoTenTX) {
		this.hoTenTX = hoTenTX;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public int getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(int doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	public void  nhapChuyenXe() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		maSo=scanner.nextLine();
		System.out.println("Nhap ten tai xe: ");
		hoTenTX=scanner.nextLine();
		System.out.println("Nhap so xe: ");
		soXe=scanner.nextInt();
		System.out.println("Nhap doanh thu: ");
		doanhThu=scanner.nextInt();
	}
	public void xuatChuyenXe(){
		System.out.println(this.maSo+"\t"+this.hoTenTX+"\t"+this.soXe+"\t"+this.doanhThu);
	}
	
}
