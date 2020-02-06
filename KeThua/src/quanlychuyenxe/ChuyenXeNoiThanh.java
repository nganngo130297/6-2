package quanlychuyenxe;
import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKM;
	
	public ChuyenXeNoiThanh() {
		super();
	}
	
	public ChuyenXeNoiThanh(int soTuyen, int soKM) {
		super();
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKM() {
		return soKM;
	}

	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}
	public void nhapChuyenXeNoiThanh() {
		Scanner scanner= new Scanner(System.in);
		super.nhapChuyenXe();
		System.out.println("Nhap so tuyen: ");
		soTuyen=scanner.nextInt();
		System.out.println("Nhap so km: ");
		soKM=scanner.nextInt();
	}
	public void xuatChuyenXeNoiThanh() {
		super.xuatChuyenXe();
		System.out.println("So tuyen: "+soTuyen);
		System.out.println("So km: "+soKM);
	}
	
}
