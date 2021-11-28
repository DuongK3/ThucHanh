import java.util.Scanner;
public class tinhtongtu1denn {

	public static void main(String[] args) {
		int n,i,S;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập n:");
		n=sc.nextInt(); 
		
		S = 0;
		i = 1;
		        
		while(i <= n){
			S=S+i;
		    i++; }		        
	System.out.println("Tổng từ 1 đến "+n+ " là: "+S); 
	sc.close();
	}
}

