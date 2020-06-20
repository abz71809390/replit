package codingbat;

import java.util.Scanner;

public class Warmup201 {

	public static void main(String[] args) {
		//Bir dize verildiğinde, 0,1, 4,5, 8,9 ... dizinlerinde karakterlerden oluşan bir dize döndürün
		//altPairs("kitten") → "kien"
		//altPairs("Chocolate") → "Chole"
		//altPairs("CodingHorror") → "Congrr"
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string girin");
		String str=scan.next();
		
		String result="";
		for(int i=0;i<str.length(); i++){
		    if(i%4==0 || i%4==1){
		      result=result+str.charAt(i);
		    }
		  }
		 System.out.println(result);
		 
scan.close();		
	}
}
