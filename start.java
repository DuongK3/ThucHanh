package chayHam;
import java.util.Scanner;

import vietHam.ham;

public class start {
	public static void main (String[] args) {
		System.out.println(" _________________________________________ ");
		System.out.println("|___      CHUONG TRINH KIEM TRA SO     ___|");
		System.out.println("|   	      1: So nguyen to             |");
		System.out.println("|   	      2: So chinh phuong          |");
		System.out.println("|   	      3: So hoan thien            |");
		System.out.println("|   	      4: Tong cac ki so           |");
		System.out.println("|___________    5: Ket thuc   ____________|");
		
		int n = 0;
		byte chon = 0;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("Chon chuong trinh thuc hien: ");
				chon = sc.nextByte();
				} catch (Exception e) {
					System.out.println("Du lieu ban nhap khong chinh xac");
					}	 
			if (chon == 5) 
				System.out.println("Chao Tam Biet ^^");
			else
				try {
					System.out.print("Nhap so ban muon kiem tra: ");
					n = sc.nextInt();
				} catch (Exception e2) {
					System.out.println("Loi du lieu, vui long chay lai chuong trinh"); break; 
				} 
			switch(chon) {
				case 1: 
					ham.soNguyenTo(n); break;
				case 2:
					ham.soChinhPhuong(n); break;
				case 3: 
					ham.soHoanThien(n); break;
				case 4: 
					ham.tongKiSo(n); break;		
					
			}	
		}				
		while (chon != 5);	
		sc.close();				
	}	
}

