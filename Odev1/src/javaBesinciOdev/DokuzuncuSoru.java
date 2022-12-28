package javaBesinciOdev;

import java.util.Scanner;

public class DokuzuncuSoru {
//	
//	9 Kullanicidan pozitif bir rakam girmesini isteyin ve 
//	girilen rakama gore 
//	carpim tablosu olusturun. Ornek,kullanici 3 girerse,
//	1 2 3
//	2 4 6
//	3 6 9

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir rakam giriniz");
		
		int rakam = scan.nextByte();
		//int carpim =1; 
		
		for(int i=1;i<=rakam;i++) {
			
		for(int j=1; j<=rakam; j++) {
			
			System.out.print(i*j+ " ");
			
		}
			System.out.print("\n");
		
		}
		
		
	}
	
}
