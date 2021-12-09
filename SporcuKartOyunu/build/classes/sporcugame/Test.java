package sporcugame;

import java.util.ArrayList;

public class Test {
    
    public static void main(String[] args) {
        
    //ArrayList<String> sporcutakimlari = new ArrayList<>();
    //ArrayList<String> sporcuisimleri = new ArrayList<>();
    ArrayList<Futbolcu> futbolcuListesi = new ArrayList<>();
    ArrayList<Basketbolcu> basketbolcuListesi = new ArrayList<>();
    //ArrayList<Integer> liste = new ArrayList<>();
    //Basketbolcu bas1 = new Basketbolcu("Işıl Alben", "Basketbol");
    //basketbolcuListesi.add(bas1);
    Basketbolcu isil = new Basketbolcu("Işıl Alben", "Basketbol");
    Basketbolcu nevriye = new Basketbolcu("Nevriye Yılmaz", "Basketbol");
    Basketbolcu birsel = new Basketbolcu("Birsel Vardarlı", "Basketbol");
    Basketbolcu ayse = new Basketbolcu("Ayşe Cora", "Basketbol");
    Basketbolcu meltem = new Basketbolcu("Meltem Yıldızhan", "Basketbol");
    Basketbolcu yasemen = new Basketbolcu("Yasemen Saylar", "Basketbol");
    Basketbolcu esra = new Basketbolcu("Esra Şencebe", "Basketbol");
    Basketbolcu bahar = new Basketbolcu("Bahar Çağlar", "Basketbol");
    
    
    basketbolcuListesi.add(isil);
    basketbolcuListesi.add(nevriye);
    basketbolcuListesi.add(birsel);
    basketbolcuListesi.add(ayse);
    basketbolcuListesi.add(meltem);
    basketbolcuListesi.add(yasemen);
    basketbolcuListesi.add(esra);
    basketbolcuListesi.add(bahar);
    
    isil.setIkilik(95);
    isil.setUcluk(80);
    isil.setSerbestAtis(70);
    
    nevriye.setIkilik(75);
    nevriye.setUcluk(60);
    nevriye.setSerbestAtis(60);
    
    birsel.setIkilik(70);
    birsel.setUcluk(45);
    birsel.setSerbestAtis(75);
    
    ayse.setIkilik(85);
    ayse.setUcluk(70);
    ayse.setSerbestAtis(80);
    
    meltem.setIkilik(60);
    meltem.setUcluk(90);
    meltem.setSerbestAtis(50);
    
    yasemen.setIkilik(80);
    yasemen.setUcluk(100);
    yasemen.setSerbestAtis(90);
    
    esra.setIkilik(65);
    esra.setUcluk(85);
    esra.setSerbestAtis(95);
    
    bahar.setIkilik(100);
    bahar.setUcluk(95);
    bahar.setSerbestAtis(50);
    
    
    
    Futbolcu cris = new Futbolcu("Cristiano Ronaldo", "Futbol");
    Futbolcu muslera = new Futbolcu("Fernando Muslera", "Futbol");
    Futbolcu melo = new Futbolcu("Felipe Melo", "Futbol");
    Futbolcu drogba = new Futbolcu("Didier Drogba", "Futbol");
    Futbolcu wesley = new Futbolcu("Wesley Sneijder", "Futbol");
    Futbolcu rustu = new Futbolcu("Rüştü Reçber", "Futbol");
    Futbolcu metin = new Futbolcu("Metin Oktay", "Futbol");
    Futbolcu ibrahim = new Futbolcu("İbrahim Toraman", "Futbol");
    futbolcuListesi.add(cris);
    futbolcuListesi.add(muslera);
    futbolcuListesi.add(melo);
    futbolcuListesi.add(drogba);
    futbolcuListesi.add(wesley);
    futbolcuListesi.add(rustu);
    futbolcuListesi.add(metin);
    futbolcuListesi.add(ibrahim);
    
    cris.setPenaltı(95);
    cris.setKaleciKarsiKarsiya(95);
    cris.setSerbestAtis(80);
    
    muslera.setPenaltı(75);
    muslera.setKaleciKarsiKarsiya(100);
    muslera.setSerbestAtis(55);
    
    melo.setPenaltı(90);
    melo.setKaleciKarsiKarsiya(65);
    melo.setSerbestAtis(65);
    
    drogba.setPenaltı(70);
    drogba.setKaleciKarsiKarsiya(45);
    drogba.setSerbestAtis(85);
    
    wesley.setPenaltı(80);
    wesley.setKaleciKarsiKarsiya(95);
    wesley.setSerbestAtis(70);
    
    rustu.setPenaltı(55);
    rustu.setKaleciKarsiKarsiya(75);
    rustu.setSerbestAtis(100);
    
    metin.setPenaltı(75);
    metin.setKaleciKarsiKarsiya(75);
    metin.setSerbestAtis(60);
    
    ibrahim.setPenaltı(70);
    ibrahim.setKaleciKarsiKarsiya(55);
    ibrahim.setSerbestAtis(75);
    
    
    //liste.add(5);
    //sporcutakimlari.add("Basketbol");   
    //sporcuisimleri.add("Işıl");
    
    //j'ai commance ici
    //random basketci dagitma
    ArrayList<Basketbolcu> bilgisayarBasket=new ArrayList<>();
    ArrayList<Basketbolcu> oyuncuBasket=new ArrayList<>();
    
    for(int i=0 ; i<4; i++){
        int random ;
        random=((int)((Math.random())*10))%(basketbolcuListesi.size()); //???
        //System.out.println(random);
        bilgisayarBasket.add(basketbolcuListesi.get(random));
        basketbolcuListesi.remove(random);
        
        random=((int)((Math.random())*10))%(basketbolcuListesi.size());
        oyuncuBasket.add(basketbolcuListesi.get(random));
        basketbolcuListesi.remove(random); 
    }
    
    for(int i =0 ; i<4 ; i++){
        System.out.println("bilgisayarin basket oyuncusu : "+ bilgisayarBasket.get(i).getBasketbolcuAdi());
    }
    for(int i =0 ; i<4 ; i++){
        System.out.println("oyuncunun basket oyuncusu : "+ oyuncuBasket.get(i).getBasketbolcuAdi());
    }
    System.out.println();
    
    //Random futbolcu dagitma
    ArrayList<Futbolcu> bilgisayarFutbol=new ArrayList<>();
    ArrayList<Futbolcu> oyuncuFutbol=new ArrayList<>();
    
    for(int i=0 ; i<4; i++){
        int random ;
        random=((int)((Math.random())*10))%(futbolcuListesi.size());
        //System.out.println(random);
        bilgisayarFutbol.add(futbolcuListesi.get(random));
        futbolcuListesi.remove(random);
        
        random=((int)((Math.random())*10))%(futbolcuListesi.size());
        oyuncuFutbol.add(futbolcuListesi.get(random));
        futbolcuListesi.remove(random);
        
    }
    
    for(int i =0 ; i<4 ; i++){
        System.out.println("bilgisayarin futbolcu oyuncusu : "+ bilgisayarFutbol.get(i).getFutbolcuAdi());
    }
    for(int i =0 ; i<4 ; i++){
        System.out.println("oyuncunun futbolcu oyuncusu : "+ oyuncuFutbol.get(i).getFutbolcuAdi());
    }
   
    }
   
    public void pozisyonBilgisi(){
        
    }
} 