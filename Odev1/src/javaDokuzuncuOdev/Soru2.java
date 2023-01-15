package javaDokuzuncuOdev;

import java.time.LocalDate;
import java.util.Scanner;

public class Soru2 {
//	
//	2. Kullanicidan dogum tarihini isteyin ve yasini; 
 

//	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dogdugunuz yili giriniz");
		int yil = scan.nextInt();
		System.out.println("Dogdugunuz ayi giriniz");
		
		int ay = scan.nextInt();

		System.out.println("Dogdugunuz gunu giriniz");
		int gun = scan.nextInt();
		
		yasHesapla( yil, ay , gun);
		
		System.out.println(ay);
	}

	public static void yasHesapla(int yil, int ay , int gun) {
		//	a) Gun, ay, yil olarak yasHesapla() static void metodu’ nda,

		LocalDate tarih = LocalDate.of(yil, ay, gun);
		
		System.out.println("Dogum tarihiniz = " + tarih);
		
		
		
	}
	
	
	//	b) Sade ay olarak ay() non-static void metodu’ nda,
	
	
	
	public int ay(int ay) {
		
		Soru2 obj1 = new Soru2 (); 
		
		return ay;
		
		
		
	}
	
//	c) Sadece gun olarak gun() non-static String donuslu method’ unda,
//	hesaplayiniz
	
	public String gun(String gun) {
		
		Soru2 obj2 = new Soru2();
		
		return gun;
	}
	
}
