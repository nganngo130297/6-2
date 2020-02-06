package lop;
import java.util.Scanner;
public class Mang {
	Scanner scanner=new Scanner(System.in);
	private int array[]=new int[5],min,max;
	
	public void nhap() {
		for(int i=0; i<array.length;i++) {
			System.out.println("Nhap phan tu thu: "+(i+1));
			array[i]=scanner.nextInt();
		}
	}
	public void hienThi() {
		for(int i=0; i<array.length;i++) {
			System.out.print("\t"+(array[i]));
		}
	}
	public int phanTuNN() {
		min=array[0];
		for(int i=1; i<array.length;i++) {
			if(array[i]<min) min=array[i];
		}
		return min;
	}
	public int phanTuLN() {
		max=array[0];
		for(int i=1; i<array.length;i++) {
			if(array[i]>max) max=array[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Mang mang=new Mang();
		mang.nhap();
		mang.hienThi();
		System.out.println("\nPhan tu nho nhat:"+mang.phanTuNN());
		System.out.println("Phan tu lon nhat:"+mang.phanTuLN());
	}

}
