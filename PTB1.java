	// Khai báo thư viện
import java.util.Scanner;
public class PTB1 {

	public static void main(String[] args) {
	// Khai báo biến
int a,b,c;
float x;

Scanner sc = new Scanner(System.in);

    // Nhập dữ liệu a,b,c từ bàn phím
System.out.print("Nhap a: ");
a = sc.nextInt();
System.out.print("Nhap b: ");
b = sc.nextInt();
System.out.print("Nhap c: ");
c = sc.nextInt();

	// Khai triển công thức và in ra màn hình
if (a == 0) {
    if (b == 0) {
        System.out.println("Phuong trinh co vo so nghiem"); }
    else {
        System.out.println("Phuong trinh vo nghiem"); }
  }
else {
    x = (float)(c-b)/a;
    System.out.println("Phuong trinh co 1 nghiem duy nhat x = "+x);
			}
		}
	}

