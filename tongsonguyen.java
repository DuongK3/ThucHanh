import java.util.Scanner;
public class tongsonguyen {

	public static void main(String[] args) {
		int n;
	Scanner sc = new Scanner(System.in);	
	System.out.print("Nhập dãy số nguyên bất kì: ");
	n = sc.nextInt();
	sc.close();
	int sum =0;
	while (n>0)
	{
		System.out.println("n/2 = " +n%10);
		sum = sum + n%10;
		n = n/10;
		System.out.println("n/2 = "+n);		
	}
}		
}


