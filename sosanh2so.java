	//Khai báo thư viện
import java.util.Scanner;
public class sosanh2so {
	
	public static void main(String[] args) {
	//Khai báo biến
		float a,b;
		
	Scanner sc=new Scanner(System.in);
	
	// Nhập giá trị a,b từ bàn phím
		System.out.print("Nhap a: ");
		a = sc.nextFloat();
		System.out.print("Nhap b: ");
		b = sc.nextFloat();
		
	//Khởi tạo công thức và xuất kết quả ra màn hình
		if (a>b) {
			System.out.println(a+ " > " +b+ " :A lon hon B"); }
		else {
			if (a<b) { 
				System.out.println(a+ " < " +b+ " :A be hon B"); }
				else {
				System.out.println(a+ " = " +b+ " :A bang B"); }
		}
	}

}