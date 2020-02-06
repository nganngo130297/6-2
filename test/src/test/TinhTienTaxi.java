package test;
import java.util.Scanner;
import java.math.*;

public class TinhTienTaxi {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double km;
		double tien=0.00;
		System.out.println("Nhap so km:");
		km=scanner.nextDouble();
		while(km>=0) {
			if(km>25) tien+=13.300;
			if(km>0.8 && km<=25)  tien+=16.300;
			if(km<=0.8) tien+=14.000;
			km--;
		}System.out.println(tien);
	}
}
