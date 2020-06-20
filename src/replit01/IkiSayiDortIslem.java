package replit01;

import java.util.Scanner;

public class IkiSayiDortIslem {

	public static void main(String[] args) {
//İki sayının toplamını , çarpımını, farkını, bölümünü ve geri kalanını yazdıran  bir Java programı yazın.

		Scanner in = new Scanner(System.in);
		//Input first number: 125
		//Input second number: 24
		
		  int num1 = in.nextInt();
		  int num2 = in.nextInt();
		  
		 System.out.println(num1+"+"+num2+"="+(num1 + num2));
		 System.out.println(num1+"-"+num2+"="+(num1 - num2));
		 System.out.println(num1+"x"+num2+"="+num1 * num2);
		 System.out.println(num1+"/"+num2+"="+num1 / num2);
		 System.out.println(num1+"mod"+num2+"="+num1 % num2);
		 
	in.close();	 
	}

}
