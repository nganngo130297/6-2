package baitap;
 
import java.util.Date;
import java.util.Scanner;
 
public class Nguoi {
    private String hoTen;
    private String soCMND;
    private String queQuan;
     
    public Nguoi() {
       // super();
    }
     
    public Nguoi(String hoTen, String queQuan, String soCMND) {
       // super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
     
    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
     
    public void nhapThongTinKhachTro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ten: ");
        hoTen = scanner.nextLine();
        System.out.print("Que: ");
        queQuan = scanner.nextLine();
        System.out.print("CMND: ");
        soCMND = scanner.nextLine();
    }
     
    public void hienThiThongTinKhachTro() {
        System.out.println("Ten: " + hoTen);
        System.out.println("Que: " + queQuan);
        System.out.println("CMND: " + soCMND);
    }
    public static void main(String[] args) {
    	Nguoi nguoi=new Nguoi();
    	nguoi.nhapThongTinKhachTro();
    	nguoi.hienThiThongTinKhachTro();
    }
}

