package javaDorduncuOdev;

import java.util.Scanner;

public class DorduncuSoru {
	
//	Kullanicidan ismini, soyismini ve kredi karti
//bilgisini isteyin ve asagidaki gibi 
//	yazdirin.
//	isim-soyisim : O*** K***** 
//	kart no : **** **** **** 1234
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Isminizi giriniz");
		
		String isim = scan.nextLine();
		
		System.out.println("Soyisminizi giriniz");
		
		String soyisim = scan.nextLine();
		
		System.out.println("16 haneli kart numaranizi giriniz");
		
		String kartno = scan.nextLine();
		
		System.out.println("Isim&soyisim: " + isim.charAt(0) + isim.substring(1).replaceAll("\\S", "*" ) + "\t" + 
		soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\S", "*"));
		
	    System.out.println(kartno.substring(0, 9).replaceAll("\\S", "*") + kartno.substring(kartno.length()-4) );
		
 
	}

}
