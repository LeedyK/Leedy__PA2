import java.util.Scanner;
public class Encrypter {
	
	//Declare static variables
	static int x;	//represents 4-digit value the user inputs
	static int encSwap; //represents encrypted value
	public static void main(String[] args) {
		
		//initialize each of four digits
		int dig1, dig2, dig3, dig4;	
		
		//arithmetically relate x to each digit
		dig1 = x/1000;					
		dig2 = (x%1000)/100; 
		dig3 = (x%100)/10;	 
		dig4 = x%10;	
		
		//encrypt each digit according to prompt
		dig1 = (dig1+7)%10;
		dig2 = (dig2+7)%10;
		dig3 = (dig3+7)%10;	
		dig4 = (dig4+7)%10;	
		
		//return encryption with new digits, swapped
		encSwap = (dig3*1000 + dig4*100 + dig1*10 + dig2);
		
		
	}

}
