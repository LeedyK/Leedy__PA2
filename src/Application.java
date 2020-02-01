import java.util.Scanner;
public class Application {
	static int x;
	static int encSwap;
	static int decSwap;

	public static void main(String[] args) {
		
		//Prompt user to input 4-digit variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit value: ");
		x = sc.nextInt();
		//Output final values after encryption-decryption cycle
		System.out.println("Encrypted value: "+ encSwap);
		System.out.println("Final encrypted/decrypted value: "+ decSwap);
		

	}

}
