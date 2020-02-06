package donggoi;
import java.util.*;
@SuppressWarnings("unused")
public class KhachTro {
	private int ngayTro;
	private String loaiPhong;
	private int gia;
	private Nguoi nguoi;
	
	public KhachTro() {
	
	}
	public KhachTro(int ngayTro, String loaiPhong,int gia, Nguoi nguoi) {
		this.ngayTro = ngayTro;
		this.loaiPhong = loaiPhong;
		this.gia=gia;
		this.nguoi = nguoi;
	}
	public int getNgayTro() {
		return ngayTro;
	}
	public void setNgayTro(int ngayTro) {
		this.ngayTro = ngayTro;
	}
	public String getLoaiPhong() {
		return loaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.loaiPhong = loaiPhong;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public Nguoi getNguoi() {
		return nguoi;
	}
	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}
	public void nhapKhach() {
		Scanner scanner=new Scanner(System.in);
		nguoi = new Nguoi();
		nguoi.nhapNguoi();
		System.out.println("Nhap ngay tro: ");
		ngayTro=Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap loai phong: ");
		loaiPhong=scanner.nextLine();
		System.out.println("Nhap gia: ");
		gia=Integer.parseInt(scanner.nextLine());
	}
	public void xuatKhach() {
		System.out.println(nguoi.xuatNguoi()+",ngay tro:"+ngayTro+",loai phong: "+loaiPhong+",gia:"+gia);
	}
	public int tinhTien() {
		return gia*ngayTro;
	}
	
	
}
