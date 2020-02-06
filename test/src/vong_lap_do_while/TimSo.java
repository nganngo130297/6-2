package vong_lap_do_while;
import java.util.Scanner;
public class TimSo {

	public static void main(String[] args) {
		int n,m=0,tong=0;
		Scanner scanner= new Scanner(System.in);
		do {
			System.out.println("Nhap n>=0: ");
			n=scanner.nextInt();
		}while(n<0);
		
		while(tong<n) {
				m+=1;
				tong+=m;
		}
		System.out.println(tong);
			
			
		};
		
	

}
