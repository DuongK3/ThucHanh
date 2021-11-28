	// Khai báo thư viện
import java.util.Scanner;
public class PTB2 {
	
    public static void main(String[] args) {
    	
    // Khai báo biến
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        
    // Nhập dữ liệu a,b,c từ bàn phím
        System.out.print("Nhập a: ");
        a = sc.nextDouble();
        System.out.print("Nhập b: ");
        b = sc.nextDouble();
        System.out.print("Nhập c: ");
        c = sc.nextDouble();
        
    // Khai triển công thức và in ra màn hình
        delta = (b*b)-(4*a*c);
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm"); }
         else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phương trinh có 1 nghiệm là x1 = x2 = " +x1); }
         else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm x1 = " +x1 + " và x2 = " +x2);
        }
    }
}
