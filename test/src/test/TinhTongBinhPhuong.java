package test;
import java.util.Scanner;
import java.math.*;

public class TinhTongBinhPhuong {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double n,kq=0;
		System.out.println("Nhap n:");
		n=scanner.nextInt();
		while(n>=1) {
			kq+=Math.pow(n, 2);
			n--;
		}
		System.out.println(kq);
	}

}
