import java.util.Scanner;
public class Decrypter {
	
	//Declare static variables
	static int encSwap; 
	static int decSwap; //should be the same as x

	public static void main(String[] args) {
		
		//initialize each of the four digits
		int dig1, dig2, dig3, dig4;	
		
		//arithmetically relate encSwap to each digit
		dig1 = encSwap/1000;					
		dig2 = (encSwap%1000)/100; 
		dig3 = (encSwap%100)/10;	 
		dig4 = encSwap%10;	

		//decrypt each digit back to its pre-encrypted value
		dig1 = (dig1+3)%10;
		dig2 = (dig2+3)%10;
		dig3 = (dig3+3)%10;	
		dig4 = (dig4+3)%10;	
		
		//return fully decrypted 4-digit value
		decSwap = (dig3*1000 + dig4*100 + dig1*10 + dig2);
		
		System.out.println(decSwap);
	}

}
