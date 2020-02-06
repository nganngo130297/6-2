package first_project;

import java.util.Scanner;
import java.util.ArrayList;

public class NhanVien {
	public String hoTen, soDienthoai, ketQua, thongTin;
	static ArrayList<String> nv = new ArrayList<>(3);
	static ArrayList<NhanVien> nvTest = new ArrayList<NhanVien>();

	static Scanner scanner = new Scanner(System.in);

	public NhanVien(String hoTen, String soDienthoai) {
		super();
		this.hoTen = hoTen;
		this.soDienthoai = soDienthoai;
	}

	public NhanVien() {
		// TODO Auto-generated constructor stub
	}

	public void nhap() {

		System.out.println("Nhap vao 3 nan vien");
		for (int i = 0; i < 3; i++) {
			System.out.println("Nhan vien thu" + (i + 1));
			hoTen = scanner.nextLine();
			System.out.println("So dien thoai");
			soDienthoai = scanner.nextLine();
			// thongTin = hoTen + "\t" + soDienthoai;
			nvTest.add(new NhanVien(hoTen, soDienthoai));
		}
	}

	public String timNhanVienTheoTen(String tenNV) {
		// String[] thongTinNV = thongTin.split("\t");
		for (int i = 0; i < nvTest.size(); i++) {
			if (nvTest.get(i).hoTen.equals(tenNV)) {
				ketQua = "Có nhân viên tên " + tenNV;
				break;
			} else {
				ketQua = "Không có nhân viên tên " + tenNV;
			}
		}
		return ketQua;
	}

	public static void main(String[] args) {
		NhanVien n = new NhanVien();
		n.nhap();
		System.out.println("Nhap ten nhan vien can tim:");
		String Ten2 = scanner.nextLine();
		System.out.println(n.timNhanVienTheoTen(Ten2));
	}
}
