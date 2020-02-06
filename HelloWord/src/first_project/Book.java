package first_project;
import java.util.Scanner;
import java.util.ArrayList;
public class Book {
	private String tenSach;
	private int tongSoSach,soDangChoMuon;
	ArrayList<String> arrBook=new ArrayList<>();
	
	/*public void nhap() {
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Nhap tong: ");
		tong=scanner.nextInt();
		for(int i=0;i<=tong;i++) {
			
			System.out.println("Nhap ten sach thu "+i+ ":");
			tenSach=scanner.nextLine();
			arrBook.add(tenSach);
		}	
		System.out.println("Nhap so sach dang muon: ");
		muon=scanner.nextInt();
}
*/
	public void nhap() {
		Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tổng số sách: ");  
        tongSoSach =  Integer.parseInt(scanner.nextLine());
        //tongSoSach=scanner.nextInt();
        System.out.println("Nhập tên sách: ");
        
        for (int i = 0; i < tongSoSach; i++) {
            System.out.print("Nhập tên sách thứ " + (i+1) + ": ");
            tenSach = scanner.nextLine();
            arrBook.add(tenSach);
        }
        
        System.out.println("Nhập số sách đang cho mượn: ");
        soDangChoMuon = scanner.nextInt();
    }
	public int conlai(int tong, int muon) {
		return (tong-muon);
	}
	public void hienThi() {
		System.out.println("CAC SACH:");
		 for (int i = 0; i < arrBook.size(); i++) {
			 System.out.println(arrBook.get(i));
		 }
	}	
	public static void main(String[] args) {
		Book book=new Book();
		book.nhap();
		book.hienThi();
		System.out.println("So sach con lai la: "+book.conlai(book.tongSoSach,book.soDangChoMuon));
		
	}
}
