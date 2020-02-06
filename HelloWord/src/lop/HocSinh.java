package lop;
import java.util.Scanner;

public class HocSinh {
	public String hoTen,lop;
	private double t,l,h,tb;
	Scanner scanner= new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap hoten: ");
		hoTen=scanner.nextLine();
		System.out.println("Nhap lop: ");
		lop=scanner.nextLine();
		System.out.println("Nhap toan: ");
		t=scanner.nextInt();
		System.out.println("Nhap ly: ");
		l=scanner.nextInt();
		System.out.println("Nhap hoa: ");
		h=scanner.nextInt();
	}
	public double TrungBinh(double toan, double ly, double hoa) {
		tb=(toan+ly+hoa)/3;
		return tb;
	}
	public String xepLoai(double diemTB) {
		if(diemTB>=8 && diemTB<=10)
			return "Gioi";
		if (diemTB >= 6.5 && diemTB < 8) {
            return "Khá";
        }
        if (diemTB >= 5.0 && diemTB < 6) {
            return "Trung bình";
        }
        if (diemTB >= 0.0 && diemTB < 5) {
            return "Yếu";
        }
        return "Nhập sai!";
	}
	public static void main(String[] args) {
		
		HocSinh hocsinh=new HocSinh();
		hocsinh.nhap();
		System.out.println(hocsinh.TrungBinh(hocsinh.t, hocsinh.l, hocsinh.h));
		System.out.println(hocsinh.xepLoai(hocsinh.TrungBinh(hocsinh.t, hocsinh.l, hocsinh.h)));
	}

}
