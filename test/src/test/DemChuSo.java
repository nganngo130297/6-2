package test;
import java.util.Scanner;
public class DemChuSo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n,kq=0;
		System.out.println("nhap n: ");
		n=scanner.nextInt();
		while(n>=10) {
			kq+=1;
			n=n/10;
			
		}
		System.out.println("kq:"+(kq+1));

	}

}
