package quanlynhanvien;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		NhanVien nhanvien;
		List<NhanVien> listNhanVien=new ArrayList<>();
		for(int i=0;i<2;i++) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Nhap nhan vien thu"+(i+1));
			nhanvien= new NhanVien();
			nhanvien.nhapNhanVien();
			listNhanVien.add(nhanvien);
		}
		System.out.println("---DS nhan vien---");
		for(int i=0;i<listNhanVien.size();i++) {
			listNhanVien.get(i).xuatNhanVien();
		}
		System.out.println("---xuat luong---");
		for(int i=0;i<listNhanVien.size();i++) {
			double luong=listNhanVien.get(i).getLuong();
			System.out.println(luong);
		}
		
	}

}
