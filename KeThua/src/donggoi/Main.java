package donggoi;
import java.util.*;
@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	 KhachTro khach;
	 int n;
	 List<KhachTro> kList= new ArrayList<>();
	 System.out.println("Nhap so khach hang: ");
	 n=scanner.nextInt();
	 for(int i=1;i<=n;i++) {
		 khach=new KhachTro();
		 System.out.println("Nhap thong tin khach hang thu "+i);
		 khach.nhapKhach();
		 kList.add(khach);
	 }
	 System.out.println("-------------THONG TIN KHACH HANG-------------");
	 for(int i=0;i<kList.size();i++) {
		 kList.get(i).xuatKhach();
	 }
	 System.out.println("-------------------------");
	 System.out.println("Nhap thong tin khach tra phong");
	 String socm1=scanner.nextLine();
	 String socm=scanner.nextLine();
	 System.out.println("-------------THONG TIN TRA PHONG-------------");
	 for(int i=0;i<kList.size();i++) {
		 if(kList.get(i).getNguoi().getChungMinh().equalsIgnoreCase(socm)) {
			 System.out.println("Thong tin khach hang: "+kList.get(i).getNguoi().getHoTen().toString());
			 System.out.println("So tien phai tra: "+kList.get(i).tinhTien());
			 break;
		 }
	 }
	 

	}

}
