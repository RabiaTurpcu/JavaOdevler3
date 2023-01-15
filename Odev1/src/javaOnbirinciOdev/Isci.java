package javaOnbirinciOdev;

import java.util.ArrayList;

public class Isci extends Muhasebe {
	
	Isci(String isim, String soyisim, String statu,String adres, String telefon){
		
		super.isim = isim;
		super.soyisim = soyisim;
		super.statu = statu;
		super.adres = adres;
		super.telefon = telefon;
		
	}
	
	public static void main(String[] args) {
		
	Isci obj1 = new Isci("ahmet" , "Kara","Bolum sefi", "Istabul/pendik","5516577654");	
	
	//int id = obj1.
	
	ArrayList <String> list = new ArrayList<>();
	
	String id1 = String.valueOf(obj1.idAtama());
	String maas1 = String.valueOf(obj1.maasHesapla(150));
	
	list.add(obj1.isim);
	list.add(obj1.soyisim);
	list.add(obj1.statu);
	list.add(obj1.adres);
	list.add(obj1.telefon);
	
	list.add(maas1);
	list.add(id1);
	System.out.println("1. iscinin bilgileri = " +list);
	
	ArrayList<String> list2 = new ArrayList<>();
	Isci obj2 = new Isci("Ayse","Ozel","Izmir/Bornova","Isci","53356544536");
	
	String id2 = String.valueOf(obj2.idAtama());
	String maas2 = String.valueOf(obj2.maasHesapla(100));
	
	
	list2.add(obj2.isim);
	list2.add(obj2.soyisim);
	list2.add(obj2.statu);
	list2.add(obj2.adres);
	list2.add(obj2.telefon);
	
	list2.add(id2);
	list2.add(maas2);
	 System.out.println("2. iscinin bilgileri = " +list2);
	 
	 
	ArrayList<String> list3 = new ArrayList<>();
	Isci obj3 = new Isci("Gamze","Karacay","Ankara/ke.kecioren","Ustabasi","5524567645");
	
	String id3 = String.valueOf(obj3.idAtama());
	String maas3 = String.valueOf(obj3.maasHesapla(130));
	
	list3.add(obj3.isim);
	list3.add(obj3.soyisim);
	list3.add(obj3.statu);
	list3.add(obj3.adres);
	list3.add(obj3.telefon);
	
	list3.add(id3);
	list3.add(maas3);
	
	System.out.println("3. Iscinin Bilgileri= " +list3);
	
	Memur.memur();

		

	}
		
	
	
	
	
	

}
