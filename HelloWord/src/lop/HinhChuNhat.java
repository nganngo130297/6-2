package lop;
import java.util.Scanner;
public class HinhChuNhat {
	Scanner scanner=new Scanner(System.in);
	double d,r,kq,cv;
	public void nhap() {
		System.out.println("Nhap chieu dai: ");
		d=scanner.nextDouble();
		System.out.println("Nhap chieu rong: ");
		r=scanner.nextDouble();
	}
	public void hienThi(double dai, double rong) {
		System.out.println("Chieudai la: "+dai);
		System.out.println("Chieurong la: "+rong);
	}
	public double dienTich(double dai, double rong) {
		kq=dai*rong;
		return kq;
	}
	public double chuVi(double dai, double rong) {
		cv=(dai+rong)*2;
		return cv;
	}
	public static void main(String[] args) {
	 HinhChuNhat hcn=new HinhChuNhat();
	 hcn.nhap();
	 hcn.hienThi(hcn.d,hcn.r);
	 System.out.print(hcn.dienTich(hcn.d, hcn.r));
	 System.out.print(hcn.chuVi(hcn.d, hcn.r));
	}

}
