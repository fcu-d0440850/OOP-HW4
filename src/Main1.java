import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		NissanTiida b=new NissanTiida();
		Scanner scanner = new Scanner (System.in);
		int num;
		System.out.println("Enter an integer :");
		num=scanner.nextInt();
		
		for(int i=0;i<=num;i++){
			b.Tiida(i);
		}
	}

}
