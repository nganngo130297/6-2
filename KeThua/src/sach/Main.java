package sach;
import java.util.*;
public class Main {

@SuppressWarnings("resource")
public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		SachGiaoKhoa giaokhoa= new SachGiaoKhoa();
		
		double slsgk,slstk,ttt1=0,ttk=0;
		List<SachGiaoKhoa> sgk= new ArrayList<>();
		List<SachThamKhao> stk= new ArrayList<>();
		System.out.println("Nhap so luong sach giao khoa: ");
		slsgk=scanner.nextDouble();
		for(int i=0;i<slsgk;i++) {
			System.out.println("Nhap SGK thu "+(i+1));
			giaokhoa.nhapSachGiaoKhoa();
			sgk.add(giaokhoa);	
		}
		for(int i=0;i<sgk.size();i++) {
			if(sgk.get(i).getTinhTrang()==1) 
				ttt1+=giaokhoa.getGia()*giaokhoa.getSoLuong();
			if(sgk.get(i).getTinhTrang()==0)
				ttt1+=giaokhoa.getGia()*(double)50/100*giaokhoa.getSoLuong();
		}
		System.out.println("SUM: "+ttt1);
		System.out.println("Nhap so luong sach tham khao: "); 
		SachThamKhao thamkhao= new SachThamKhao();
		slstk=scanner.nextDouble();
		for(int j=0;j<slstk;j++) {
			System.out.println("Nhap STK thu "+(j+1));
			thamkhao.nhapSachThamKhao();
			stk.add(thamkhao);	
		}
		int k;
		for(k=0;k<stk.size();k++) {
			ttk+=stk.get(k).getGia();
		}
		System.out.println("Gia trung binh:"+(ttk/k));
	}
}
