package replit01;

import java.util.Scanner;

public class SayininRakamlarToplami {

	public static void main(String[] args) {
//Sayının rakamlar  toplamasını yapan Java kodu yazınız.

		 Scanner input = new Scanner(System.in);
		 System.out.println("Bir sayi giriniz.");
	        long n = input.nextLong();
	        System.out.println("Rakamlar Toplama: " + sumDigits(n));

	    }

	    public static int sumDigits(long n) {
	     
	      int sum=0;
	    	while(n!=0) {
	    		sum+= n%10;
	    		n/= 10;
	    	}
	        return sum;
	        
	        
	}

}
