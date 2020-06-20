package replit01;

public class BinomAcilimi {

	public static void main(String[] args) {
			
			String bos= "         ";//9 tane bos characterli bir string	
			int lng=bos.length();//bunun length'ini aldim	
			String satir="";//her satiri yazdiracagim bir satir tanittim	
			
			/*
			 asagida konbinasyon ve faktoriyel methodlari olusturup 
			 ihtiyacigim oldugunda cagirtim
			 (i,j)===> (i+1). satirdaki j. eleman
			 */
			
			for(int i=0; i<(lng+1)/2; i++) {		
				satir=bos.substring(0, (lng+1)/2-i-1);		
				for (int j=0; j<=i; j++) {			
			         satir=satir+comb(i,j);
			         satir=satir+" ";	
				}
				System.out.println(satir);
				satir=bos.substring(0, (lng+1)/2-i);		
			}	
		}
		static int comb(int a ,int b ) {
			return fak(a)/(fak(a-b)*fak(b));	
		}
		static int fak(int num) {
		    int prod=1;
			for (int i1=1; i1<=num; i1++) {
				prod=prod*i1;
			}
			return prod;
	     }

}
