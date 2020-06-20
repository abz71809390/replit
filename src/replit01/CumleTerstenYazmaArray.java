package replit01;

import java.util.Scanner;

public class CumleTerstenYazmaArray {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Bir cümle giriniz");
		 String sentence=input.nextLine();
		 
		 String sentence1[] = sentence.split(" ");
		    
		 String reversed = "";
		 for(int i=sentence1.length-1;i>=0; i--){
		     reversed=reversed+sentence1[i]+" ";
		    }
		   System.out.println(reversed);
  input.close();
	}

}
