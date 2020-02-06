package quanlychuyenxe;
import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
	private String noiDen;
	private int soNgay;
	
	public ChuyenXeNgoaiThanh() {
		super();
	}
	public ChuyenXeNgoaiThanh(String noiDen, int soNgay) {
		super();
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getSoNgay() {
		return soNgay;
	}
	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}
	public void nhapChuyenXeNgoaiThanh() {
		Scanner scanner= new Scanner(System.in);
		super.nhapChuyenXe();
		System.out.println("Nhap noi den: ");
		noiDen=scanner.nextLine();
		System.out.println("Nhap so ngay: ");
		soNgay=scanner.nextInt();
	}
	public void xuatChuyenXeNgoaiThanh() {
		super.xuatChuyenXe();
		System.out.println("Noi den: "+noiDen);
		System.out.println("So ngay: "+soNgay);
	}
	
	
	
	
	
	
}
