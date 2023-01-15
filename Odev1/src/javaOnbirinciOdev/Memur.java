package javaOnbirinciOdev;

import java.util.ArrayList;

public class Memur extends Muhasebe{
	
	public Memur(String isim,String soyisim,String statu, String adres, String telefon){
		
		super.isim = isim;
		super.soyisim = soyisim;
		super.statu = statu;
		super.adres = adres;
		super.telefon = telefon;
		
		
		
		
	}
	
	public static void memur() {
		
		Memur obj4 = new Memur("Faruk","Meric","Izmir/Karsiyaka","takim lideri","055398734465");
		
		ArrayList <String> list4 = new ArrayList<>();
		
		String id4 = String.valueOf(obj4.idAtama());
		String maas4 = String.valueOf(obj4.maasHesapla(200));
		
		list4.add(obj4.isim);
		list4.add(obj4.soyisim);
		list4.add(obj4.adres);
		list4.add(obj4.statu);
		list4.add(obj4.telefon);
		list4.add(id4);
		list4.add(maas4);
		System.out.println("1. memurun bilgileri= " + list4);
		
		Memur obj5 = new Memur("Sevda","Gokdag","Izmir/Alsancak","Personel Asistani","05556783421");
		
		ArrayList<String> list5 = new ArrayList<>();
		
		String id5 = String.valueOf(obj5.idAtama());
		String maas5 = String.valueOf(obj5.maasHesapla(230));
		
		list5.add(obj5.isim);
		list5.add(obj5.soyisim);
		list5.add(obj5.adres);
		list5.add(obj5.statu);
		list5.add(obj5.telefon);
		list5.add(id5);
		list5.add(maas5);
		System.out.println("2. memurun bilgileri = " + list5);
		
		Memur obj6 = new Memur("Omer","Alatepe","izmir/Buca","Personel Muduru","05543457621");
		
		ArrayList<String> list6 = new ArrayList<>();
		
		String id6 = String.valueOf(obj6.idAtama());
		String maas6 = String.valueOf(obj6.maasHesapla(i));
		list6.add(obj6.isim);
		list6.add(obj6.soyisim);
		list6.add(obj6.adres);
		list6.add(obj6.statu);
		list6.add(obj6.telefon);
		list6.add(id6);
		list6.add(maas6);
		System.out.println("3. memurun bilgileri = " + list6);
	}

}
