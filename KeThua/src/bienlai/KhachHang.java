package bienlai;
import java.util.*;
public class KhachHang {
	private String hoTen;
	private String soNha;
	private int maCongTo;
	
	public KhachHang() {
		
	}
	public KhachHang(String hoTen, String soNha, int maCongTo) {
		this.hoTen = hoTen;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoNha() {
		return soNha;
	}
	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}
	public int getMaCongTo() {
		return maCongTo;
	}
	public void setMaCongTo(int maCongTo) {
		this.maCongTo = maCongTo;
	}
	public void nhapKhachHang() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("ho ten: ");
		hoTen=scanner.nextLine();
		System.out.println("so nha: ");
		soNha=scanner.nextLine();
		System.out.println("ma cong to: ");
		maCongTo=scanner.nextInt();
	}
	public void xuatKhachHang() {
		System.out.println("ho ten: "+hoTen);
		System.out.println("so nha: "+soNha);
		System.out.println("ma cong to: "+maCongTo);
	}
	
	
}
