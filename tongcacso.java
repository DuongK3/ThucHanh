import java.util.Scanner;
public class tongcacso {

	public static void main(String[] args) {
		int n;
	System.out.print("Nhập n: ");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	if (n<1)
		System.out.println(" n phải lớn hơn 0");
	else 
	{
		int tong=0;
		for(int i=1;i<=n;i++)
			tong +=i;
		System.out.println("Tổng các số nguyên từ [1 --> +n+ là:"+tong);
	}
	sc.close();
	}
}
