package first_project;
import java.util.Scanner;
public class SapXep {
	public static void main(String[] args) {
	int n,max=100;
	int A[]=new int[max];
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap vao so luong phan tu: ");	
	n = scanner.nextInt();
	for (int i = 0; i < n; i++) {
		System.out.println("Phap phan tu thu"+i+":");
		A[i]=scanner.nextInt();
    }
	System.out.println("mang vua nhap la: ");	
	for (int i = 0; i < n; i++) {
		System.out.print(A[i]+"\t");
	}
	for (int i = 0; i < n - 1; i++) {
        for (int j = i+1; j <= n - 1; j++) {
            if (A[j] < A[i]) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
         
    // in ra màn hình mảng số sau khi sắp xếp
    System.out.println("\nMảng sau khi sắp xếp: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
}
}
}
