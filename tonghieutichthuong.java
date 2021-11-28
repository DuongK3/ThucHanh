		// khai bao thu vien
import java.util.Scanner;
public class tonghieutichthuong {

	public static void main(String[] args) {
		// khai bao bien 
		int a,b,t,h,tich;
		float thuong;
		
		Scanner sc=new Scanner(System.in);
		
		// nhap gia tri a,b tu ban phim
		System.out.print("Nhap so nguyen a: ");
		a = sc.nextInt();
		System.out.print("Nhap so nguyen b: ");
		b = sc.nextInt();	
		
		// khoi tao cong thuc
		t = a+b;
		h = a-b;
		tich = a*b;
		thuong = (float)a/b;
		
		// xuat ra ket qua 
		System.out.println("Tong cua "+a+" + "+b+" = "+t);
		System.out.println("Hieu cua "+a+" - "+b+" = "+h);
		System.out.println("Tich cua "+a+" * "+b+" = "+tich);
		System.out.println("Thuong cua "+a+" / "+b+" = "+thuong);
		
	}

}
