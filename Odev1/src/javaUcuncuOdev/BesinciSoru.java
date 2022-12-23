package javaUcuncuOdev;

import java.util.Scanner;

public class BesinciSoru {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir karakter giriniz");
		
		char k = scan.next().charAt(0);
		
		if(k>='a' && k<='z' || k>='A' && k<='Z') {
			
			System.out.println("Girdiginiz karakter harftir");
			
			
		}
		
		else {
			System.out.println("Girdiginiz karakter harf degildir");
		}
		}
}
