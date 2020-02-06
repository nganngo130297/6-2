package lop;
import java.util.Scanner;
public class QuanLySach {
	Scanner scanner=new Scanner(System.in);
	private String tenSach;
	private int tong,muon,con;
	
	public void nhap() {
		System.out.println("Nhap ten sach: ");
		tenSach=scanner.nextLine();
		System.out.println("Nhap tong so sach: ");
		tong=scanner.nextInt();
		System.out.println("Nhap tong so sach muon: ");
		muon=scanner.nextInt();
	}
	public void hienThi(String ten,int tongg,int  muonn) {
		System.out.println("Ten: "+ten);
		System.out.println("Tong:"+tongg);
		System.out.println("Muon:"+muonn);
	}
	public int tinh(int t,int m) {
		con=t-m;
		return con;
	}
	public static void main(String[] args) {
		QuanLySach ql=new QuanLySach();
		ql.nhap();
		ql.hienThi(ql.tenSach, ql.tong, ql.muon);
		System.out.println("So sach con lai la: "+ ql.tinh(ql.tong,ql.muon));
	}
	
}
