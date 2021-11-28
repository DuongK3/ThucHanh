import java.util.Scanner;
public class maybannuoctudong {

public static void main(String[] args) {
		
	int n,x,coca,pepsi,monster,ns,tienthoi,exit;
	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.println("XIN CHÀO QUÝ KHÁCH");
	System.out.println("10000 / 20000 / 50000 / 100000 / 200000");
	System.out.println("---------------------------------------");
	System.out.println("Hãy cho tiền vào máy bán nước: ");
		x = sc.nextInt();
		System.out.println("Số tiền bạn cho vào máy bán nước là: "+x+" VND");
		System.out.println("Hãy chọn loại đồ uống(1~4): 1.Coca(10k) 2.Pepsi(10k) 3.Monster(25k) 4.Nước suối(5k) : ");
		n = sc.nextInt();
		
	coca = 10000;
	pepsi = 10000;
	monster = 25000;
	ns = 5000;

	switch (n) 
	{		
		case 1: tienthoi = x - coca; 
			System.out.println("Bạn đã chọn Coca");
			System.out.println("Số tiền bạn nhận lại là: "+tienthoi); break;
		case 2: tienthoi = x - pepsi; 
			System.out.println("Bạn đã chọn Pepsi");
			System.out.println("Số tiền bạn nhận lại là: "+tienthoi); break;
		case 3: 
			if (x < 25000) 
			{
				System.out.println("Số tiền bạn cho vào máy không đủ"); 
			}
			else 
			{
				tienthoi = x - monster;
				System.out.println("Bạn đã chọn Monster");
				System.out.println("Số tiền bạn nhận lại là: "+tienthoi); 
			} break;  
		case 4: tienthoi = x - ns;
			System.out.println("Bạn đã chọn Nước suối");
			System.out.println("Số tiền bạn nhận lại là: "+tienthoi); break;	
		default:
	System.out.println("Lỗi!!! Vui lòng chỉ chọn số từ (1~4)"); 
	} 
	System.out.print("Bạn muốn tiếp tục không? (Ấn 0 để thoát - Ấn phím bất kì để tiếp tục)");
	exit = sc.nextInt();
	}
	while (exit !=0 );		
	}
}

	
			
		
	

	
	
