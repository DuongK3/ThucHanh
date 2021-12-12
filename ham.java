package vietHam;

public class ham {

	public static void soNguyenTo( int n) {
		if (n < 2) 
			System.out.println(n+" khong phai so nguyen to"); 
		else {
			int x=2;
			while ((x < n) && (n % x != 0))
				x++;
			if (x==n)
				System.out.println(n+" la so nguyen to");
			else 
				System.out.println(n+" khong phai so nguyen to");
		}
	}
	
	public static void soChinhPhuong(int n) {
		int x = (int)Math.sqrt(n);
		if (n < 1) 
			System.out.println(n+ " khong phai so chinh phuong");
		else
			if (x*x == n)
				System.out.println(n+" la so chinh phuong");
			else 
				System.out.println(n+ " khong phai so chinh phuong");	
	
	}
	
	public static void soHoanThien(int n) {
		int tong = 0;
		for (int i=1;i<=n/2;i++) {
			if (n%i==0)
				tong+=i;
		}
			if (tong==n) {
				System.out.println(n+" la so hoan thien");
			}
			else {
				System.out.println(n+" khong phai so hoan thien");
			}
	}
	
	public static void tongKiSo(int n) {
		int tong = 0;
		while (n!=0) {
			tong+= n%10;
			n/=10;
		}
			System.out.println("Tong ki so ban nhap la: "+tong);
	}			
}
	
