package first_project;
import java.util.Scanner;
public class Student {
	private String hoTen,lop;
	private double toan,ly,hoa;
	
	public void nhap() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen=scanner.nextLine();
		System.out.println("Nhap lop: ");
		lop=scanner.nextLine();
		System.out.println("Nhap diem toan: ");
		toan=scanner.nextDouble();
		System.out.println("Nhap diem ly: ");
		ly=scanner.nextDouble();
		System.out.println("Nhap diem hoa: ");
		hoa=scanner.nextDouble();
	}
	
	public double tinhDiem(double a,double b, double c) {
		return (a+b+c)/3;
		
	}
	public String xepLoai(double diemTB) {
		if (diemTB >= 8 && diemTB <= 10) {
            return "Giỏi";
        }
        if (diemTB >= 6.5 && diemTB < 8) {
            return "Khá";
        }
        if (diemTB >= 5.0 && diemTB < 6) {
            return "Trung bình";
        }
        if (diemTB >= 0.0 && diemTB < 5) {
            return "Yếu";
        }
        return "Nhập sai!";
	}
	public static void main(String[] args) {
		Student student=new Student();
		student.nhap();
		System.out.println("Diem trung binh: "+student.tinhDiem(student.toan,student.hoa,student.ly));
		System.out.println("xep loai: "+student.xepLoai(student.tinhDiem(student.toan,student.hoa,student.ly)));
	}
}
