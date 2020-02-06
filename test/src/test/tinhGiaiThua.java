package test;
import java.util.Scanner;
public class tinhGiaiThua {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n,kq=1;
		System.out.println("nhap n: ");
		n=scanner.nextInt();
		while(n>=1) {
			kq*=n;
			n--;
		}
		System.out.println(kq);

	}

}
