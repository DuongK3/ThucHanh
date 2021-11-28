import java.util.Scanner;
public class SHT {
	public static void main(String[] args) {
		int n,tong = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhập số nguyên dương bất kì: ");
	n = sc.nextInt();
	sc.close();
	
	for (int i=1;i<=n/2;i++) 
	{
		if (n%i==0)
			tong+=i;
	}
		if (tong==n) 
		{
			System.out.println(n+" là số hoàn thiện");
		}
		else 
		{
			System.out.println(n+" không là số hoàn thiện");
		}
	}
}


