package ReCapDemo_Classes;

public class DortIslem {
    public int Topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public int Cikar(int sayi1, int sayi2){
        return sayi1-sayi2;
    }
    public int Carp(int sayi1, int sayi2){
        return sayi1*sayi2;
    }
    public int Bol(int sayi1, int sayi2){ // sayi2=0 olursak program hata verir çünkü tanımlı değil.
        return sayi1/sayi2;
    } // bunlar method ve static ve void de kullanılabilir methodlarda static için class da static olmalı ama void de öyle bir şart yok
    // void le yazmadık çünkü method bir değer döndürüyor,static le de yazmadık çünkü çıkacak olan değer sadece stackte birikiyor obje olarak bir karşılığı yok.




}
