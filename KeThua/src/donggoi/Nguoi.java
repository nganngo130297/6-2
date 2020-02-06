package donggoi;
import java.util.*;
@SuppressWarnings("unused")
public class Nguoi {
	private String hoTen;
	private String queQuan;
	private String chungMinh;
	public Nguoi() {
		
	}
	public Nguoi(String hoTen, String queQuan, String chungMinh) {
		this.hoTen = hoTen;
		this.queQuan = queQuan;
		this.chungMinh = chungMinh;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getChungMinh() {
		return chungMinh;
	}
	public void setChungMinh(String chungMinh) {
		this.chungMinh = chungMinh;
	}
	public void nhapNguoi() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen=scanner.nextLine();
		System.out.println("Nhap que quan: ");
		queQuan=scanner.nextLine();
		System.out.println("Nhap chung minh: ");
		chungMinh=scanner.nextLine();
	}
	public String xuatNguoi() {
		return "ho ten: "+hoTen+",que quan:"+queQuan+",chung minh:"+chungMinh;
	}
	

	
	
	
}


