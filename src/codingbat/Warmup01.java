package codingbat;

public class Warmup01 {

	public static void main(String[] args) {
		//Bir dize verildiğinde, önüne "not" ifadesinin eklendiği yeni bir dize döndürün. 
		//Ancak, dize zaten "not" ile başlıyorsa, dizeyi değiştirmeden döndürün. 
		//Not: 2 dizeyi karşılaştırmak için .equals () kullanın.
		//notString("candy") → "not candy"
		//notString("x") → "not x"
		//notString("not bad") → "not bad"
		
		System.out.println(notString("kedi"));
		System.out.println(notString("not kus"));
	}
	public static String notString(String str) {
		  if(str.length()>=3 && str.substring(0,3).equals("not")){
		    return str;
		  }
		  return "not "+str;
		}

}
