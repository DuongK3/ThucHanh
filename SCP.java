import java.util.Scanner;
import java.lang.Math;
public class SCP {

	public static void main(String[] args) {
		int n;
		
		System.out.print("Nhập số nguyên bất kì: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		int x = (int)Math.sqrt(n);
		
		if (n < 1)
			System.out.println(n+ " không phải số chính phương");
		else
			if (x*x == n)
				System.out.println(n+" là số chính phương");
			else 
				System.out.print(n+ " không là số chính phương");
					
	}
}
