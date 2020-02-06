package sach;
import java.util.Scanner;

public class SachThamKhao extends Sach{
	private int thue;

	public SachThamKhao() {
		super();
	}
	public SachThamKhao(int thue) {
		super();
		this.thue = thue;
	}
	public int getThue() {
		return thue;
	}
	public void setThue(int thue) {
		this.thue = thue;
	}
	public void nhapSachThamKhao() {
		Scanner scanner= new Scanner(System.in);
		super.nhapSach();
		System.out.println("Thue sach: ");
		thue=scanner.nextInt();
	}
	public void xuatSachThamKhao() {
		super.xuatSach();
		System.out.println("Thue: "+thue);
	}
}