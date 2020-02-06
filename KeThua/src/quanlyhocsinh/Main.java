package quanlyhocsinh;
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n;
		HoSoHocSinh hoso;
		List<HoSoHocSinh> hsList= new ArrayList<>();
		System.out.println("Nhap so luong hoc sinh: ");
		n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("nhap SH thu:"+(i+1));
			hoso= new HoSoHocSinh();
			hoso.nhapHS();
			hsList.add(hoso);
		}
		for(int i=0;i<hsList.size();i++) {
			hsList.get(i).xuatHS();
		}
		System.out.println("--in HS theo dieu kien--");
		for(int i=0;i<hsList.size();i++) {
			if(hsList.get(i).getNguoi().getQueQuan().equalsIgnoreCase("Thai Nguyen")||hsList.get(i).getLop().equalsIgnoreCase("10A1")) {
				hsList.get(i).xuatHS();
			}
		}
	}

}
