package bienlai;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		BienLai bienlai;
		List<BienLai> listBienLai=new ArrayList<>();
		System.out.println("Nhap n: ");
		n=scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin ho dan thu "+(i+1));
			bienlai=new BienLai();
			bienlai.nhapBienLai();
			listBienLai.add(bienlai);
		}
		System.out.println("--- Thong tin tien dien----");
		for(int i=0;i<listBienLai.size();i++) {
			listBienLai.get(i).xuatBienLai();
		}
		
	}

}
