package first_project;
import java.util.Scanner;
public class DemKiTu {
	public static void main(String[] args) {
	String chuoi;
	char kiTu;
	int count=0;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("Nhap vao mot chuoi");	
		chuoi = scanner.nextLine();
	}while(chuoi.length()>80);
	System.out.println("Nhap vao motky tu");	
	kiTu = scanner.next().charAt(0);
	for (int i = 0; i < chuoi.length(); i++) {
        if (kiTu == chuoi.charAt(i)) {
            count++;
        }
    }
         
    System.out.println("Số lần xuất hiện của ký tự " + kiTu +
        " trong chuỗi " + chuoi + " = " + count);
	
}
}
