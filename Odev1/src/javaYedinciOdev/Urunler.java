package javaYedinciOdev;

import java.util.Arrays;
import java.util.Scanner;

public class Urunler {
	
//	Iki farkli class olusturun. Birinci klasta kullanicidan; bir alisveris 
//	sitesinden 5 adet urunu ucretsiz satin alabilme hakki kazandigini soyleyin 
//	ve bu 5 urunu isteyin(main method icinden).
	
	public static void main(String[] args) {
		
		
		String arr1 [] = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tebrikler kazandiniz!! 5 urun ismi giriniz");
		
		System.out.println("Birinci urunu giriniz");
		
		String birinciUrun = scan.nextLine();
		
		System.out.println("Ikinci urunu giriniz");

		String ikinciUrun = scan.nextLine();
		
		System.out.println("Ucuncu urunu giriniz");
		String ucuncuUrun = scan.nextLine();

		
		System.out.println("Dorduncu urunu giriniz");
		String dorduncuUrun = scan.nextLine();

		System.out.println("Besinci urunu giriniz");
		String besinciUrun = scan.nextLine();
		
		Liste liste = new Liste();
		
		String arr2 []= liste.Listele(birinciUrun, ikinciUrun,ucuncuUrun, dorduncuUrun, besinciUrun);
		
		
		System.out.println(Arrays.toString(arr1));
		
		arr1[2] = "yeni urun";
		
		System.out.println(Arrays.toString(arr1));
		
		int a  = Arrays.binarySearch(arr1, "yeni urun");
		
		if(a<0) {
			System.out.println("Aradiginiz urun eklenmedi");
		}
		
		else {
			
			System.out.println("Tebrikler aradiginiz urun mevcut "+(a+1)+ ". sirrada");
		}


		
		
		
		
		
	}
	

}
