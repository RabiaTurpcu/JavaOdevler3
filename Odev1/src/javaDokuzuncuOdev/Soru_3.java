package javaDokuzuncuOdev;

import java.util.Scanner;

public class Soru_3 {
//	3. Kullanicidan; Dersin adi, Vize1 notu, Vize2 notu, Final notu, 3 adet 
//	de sozlu sinav notlarini alin. Bu notlari asagidaki sartlara gore tek bir
//	method’ ta varargs kullanarak donem sonu not ortalamasi olarak 
//	gosteriniz.
//	Sartlar;
	
	public static void main(String[] args) {
		
		
		ort(null,null);

		
		
	}
	//	I. Vizelerin ortalamasinin %30’ u
//	II. Final notunun %50’ si
//	III. Sozlu sinavlarin ortalamasinin %20’ si

	public static void ort (String ders , double... args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dersin adinizi giriniz");
		
		String dersAdi  = scan.nextLine();
		
		System.out.println("1. vize notunuzu giriniz");
		double vize1 = scan.nextDouble();
		
		System.out.println("Ikinci vize notunuzu giriniz");
		double vize2 = scan.nextDouble();
		
		System.out.println("Final notunuzu giriniz");
		double final1 = scan.nextDouble();
		
		System.out.println("Birinci sozlunuzu giriniz");
		double sozlu1 = scan.nextDouble();
		
		System.out.println("Ikinci sozlunuzu giriniz ");
		double sozlu2 = scan.nextDouble();
		
		System.out.println("Ucuncu sozlunuzu giriniz");
		double sozlu3 = scan.nextDouble();
		double sonuc = (vize1 + vize2) / 2 *(0.30) + (final1*0.50) + (sozlu1+sozlu2+sozlu3)/3 * 0.20; 
		
		System.out.println( dersAdi + "isimli dersin yil sonu not ortalamasi " + sonuc);
		
		
	}
	
	
	
}
