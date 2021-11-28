import java.util.Scanner;
public class SNT {

	public static void main(String[] args) {
		int n;
		
		System.out.print("Nhập số nguyên dương n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		if (n < 2) 
			System.out.print(n+" không phải số nguyên tố"); 
		else {
			int x=2;
			while ((x < n) && (n % x != 0))
				x++;
			if (x==n)
				System.out.println(n+" là số nguyên tố");
			else 
				System.out.print(n+" không phải là số nguyên tố");
		}
	}
}
