package quanlychuyenxe;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		public static String a;
		
		int n,m,doanhthu=0,doanhthu1=0;
		ArrayList<ChuyenXeNoiThanh> cx= new ArrayList<>();
		ArrayList<ChuyenXeNgoaiThanh> cxn= new ArrayList<>();
		System.out.println("Nhap so chuyen xe noi thanh: ");
		n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			ChuyenXeNoiThanh chuyenxenoithanh=new ChuyenXeNoiThanh();
			System.out.println("Chuyen xe noi thanh thu: "+(i+1));
			chuyenxenoithanh.nhapChuyenXeNoiThanh();
			
			doanhthu+=chuyenxenoithanh.getDoanhThu();cx.add(chuyenxenoithanh);
		}
		System.out.println("Thong tin chuyen xe noi thanh: ");
		for(int i=0;i<cx.size();i++) {
			cx.get(i).xuatChuyenXeNoiThanh();
		}
		System.out.println("Doanh thu noi thanh: "+doanhthu);	
	}
}


