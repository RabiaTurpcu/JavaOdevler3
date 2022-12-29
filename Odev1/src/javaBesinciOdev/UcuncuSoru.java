package javaBesinciOdev;

import java.util.Scanner;

public class UcuncuSoru {
//	3) Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin.
//     integer donus tipli, iki argumanli bir uslu sayi hesaplama methodu 
//	olusturun. 
//	Argumanlardan birini taban sayisi icin digerini ise 
//	ussu icin kullanin. 
//	Islemin sonucunu main method’ dan verilen komutla yazdirin

	
	public static void main(String[] args) {
		//usluSayi(taban,kuvvet);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz");
		
		int taban = scan.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz");
		
		int kuvvet = scan.nextInt();
		
		int sonuc = usluSayi(taban,kuvvet);
		
		System.out.println(taban + "^" + kuvvet + "=" + sonuc );
	}
	
	
	
	public static int usluSayi(int taban, int kuvvet) {
		
		int sonuc =(int) Math.pow(taban, kuvvet);
        return sonuc;
		//return("a");
		
	}
	
}
