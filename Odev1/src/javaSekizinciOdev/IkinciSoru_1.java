package javaSekizinciOdev;

import java.util.ArrayList;

public class IkinciSoru_1 {
	
	public static void main(String[] args) {
		
		
//		Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
	
	ArrayList <String> elemanlar  = new ArrayList<String>(); 
    
	elemanlar.add("A");
	elemanlar.add("C");
	elemanlar.add("E");
	elemanlar.add("F");
	
	System.out.println(elemanlar);
	
//	2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
//	index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
//	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B
	
	elemanlar.add("B");
	elemanlar.add(1, "L");
	System.out.println(elemanlar);
	
//	3)set() methodu kullanarak, E’yi D yapiniz.
//	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B

	elemanlar.set(3, "D");
	
	System.out.println(elemanlar);
	
//	4)remove() methodu kullanarak, F’yi siliniz.
//	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
	
	elemanlar.remove(4);
	System.out.println(elemanlar);
	
//	5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
//	ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.

	elemanlar.sort(null);
	System.out.println(elemanlar);
	
//	6)contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var 
//	olmadigini dogrulayiniz
	
	System.out.println(elemanlar.contains("M"));
	System.out.println(elemanlar.contains("L"));

	
//7)size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.

	
	System.out.println(elemanlar.size());
	
//	8)clear() methodu kullanarak, list’deki tum elemanlari siliniz
	
	elemanlar.clear();
	System.out.println(elemanlar);
	
//	9)isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
	
	System.out.println(elemanlar.isEmpty());

}
}