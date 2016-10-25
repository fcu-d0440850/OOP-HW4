import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		PasswordEncorder a=new PasswordEncorder();
		scanner = new Scanner (System.in);
		int words=1;
		while(words==1){
			System.out.println("Please enter a password: ");	
			String  b= scanner.nextLine();
			if(!b.equalsIgnoreCase("exit")){
				a.enc(b);
			
				}
			else 
				break;
		
		}

	}

		}
