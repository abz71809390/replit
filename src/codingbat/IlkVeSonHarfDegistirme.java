package codingbat;

public class IlkVeSonHarfDegistirme {

	public static void main(String[] args) {
		//Bir dize verildiğinde, ilk ve son karakterlerin değiş tokuş edildiği yeni bir dize döndürün.
		
		System.out.println(frontBack("kedi"));
		System.out.println(frontBack("not kus"));
	}
	public static String frontBack(String str) {
		  if(str.length()<=1) return str;
		  
		  String orta=str.substring(1,str.length()-1);
		  return str.charAt(str.length()-1)+orta+str.charAt(0);
		}
}
