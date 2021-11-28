import java.util.Scanner;
public class doingoaite {

public static void main(String[] args) {
		
	int n;
	double x,S;
	do {
	System.out.print("Nhập số tiền(VND): ");
	Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.print("Chọn loại tiền tệ chuyển đổi(1~4): 1.USD 2.AUD 3.Yên 4.Euro : ");
		n = sc.nextInt();
	switch (n) 	{	
		case 1: S = x*0.000044; 
			System.out.printf("Số tiền đổi sang USD là: %.2f",S); break;
		case 2: S = x*0.000059; 
			System.out.printf("Số tiền đổi sang AUD là: %.2f",S); break;
		case 3: S = x*0.0050;
			System.out.printf("Số tiền đổi sang Yên là: %.2f",S); break;
		case 4: S = x*0.000038; 
			System.out.printf("Số tiền đổi sang Euro là: %.2f",S); break;
		default:
	System.out.println("Lỗi!!! Vui lòng chỉ chọn số từ (1~4)");  
	System.out.println("Nhập 0 để thoát"); } }	
	while (x != 0);	
	}
}
		
	



