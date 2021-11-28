import java.util.Scanner;
public class tongsonguyen {

	public static void main(String[] args) {
		int n,tong=0;
		Scanner sc = new Scanner(System.in);	
		System.out.print("Nhập dãy số nguyên bất kì: ");
		n = sc.nextInt();
		sc.close();
		while (n!=0) 
	{
		tong+= n%10;
		n/=10;
	}
		System.out.println("Tổng các chữ số bạn vừa nhập là: "+tong);
	}		
}


