package test;
import java.util.Scanner;

public class TimUCLNVaBCNN {
	static Scanner scanner= new Scanner(System.in);
	public static void main(String[] args) {
		int so1,so2,so11,so22,ucln,bcnn;
		System.out.println("Nhap so thu 1: ");
		so1=scanner.nextInt();
		so11=so1;
		System.out.println("Nhap so thu 2: ");
		so2=scanner.nextInt();
		so22=so2;
		if(so1==0|| so2==0) {
			ucln=so1+so2;
			System.out.print(ucln);
		}
		else {
		while(so1!=so2){
			if(so1>so2)
				so1-=so2;
			else so2-=so1;
			
		} ucln=so1;
		System.out.println(ucln);

		bcnn=so11*so22/ucln;
		System.out.println(bcnn);
	}
	}

}
