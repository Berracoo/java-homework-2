package methods2;

public class Main {
    public static void main (String[] args){
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = sehirVer(); //0. indeksten 2 ye kadar değerleri alırcak
      // yeni mesajın değeri eşittirden sonra yazdığımız metodun sonucu. bu sonuç bize bir değer gönderir
        // void olan operasyonları bir değişkene atayamayız çünkü değişkenin sonunda bir değer döndürmesi gerekir.
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam = topla2(2,3,4);//arka planda bir dizi oluşturur
        System.out.println(toplam);
    }
  //operasyon=method=fonksiyon
    public static void ekle(){  // void operasyon sanki biz emir vermişiz gibi tanımlanan şeyi yapar ama yaptığı işlemi bize vermez,  bir şey döndürmez
        System.out.println("Eklendi"); // bunu ekrana yazması bize bir değer döndürdüğü anlamına gelmez sadece verilen işi yerine getirdi
    }
    public static void sil(){
        System.out.println("Silindi.");
    }

    public static void guncelle(){
        System.out.println("Güncellendi.");

    }

    public static int topla(int sayi1,int sayi2){ // bu fonk. int türünde bir değer döndürür demek.
        return sayi1+sayi2;              // elimizde bir sayı var ve onun hesabını bir fonksiyona yaptırmış oluyoruz.
    }
    public static int topla2(int... sayilar){ // bu fonksiyon çalışırken birden fazla int göndereceksek ...(variable arguments) koyarız.
       // maindeki toplamla topla2 deki toplam normalde farklı ama eitleyince alakalı oldular.
        // buraya gönderdiğimiz sayılar aslında bir int array gibi çalışıyor
       int toplam = 0;
       for(int sayi:sayilar){ // sayılardaki her bir sayı için
           toplam += sayi;
       }
       return toplam;
    }
    public static String sehirVer(){
        return "Ankara";
    }
    //bir değişkene bağlı olarak yazacağın fonksiyonlarda iki tarafında türü aynı olmalı int e int vb.
    // variable arguments oop de genelde kullanılmaz çünkü nesnelerin tespit edilebilirliği azalır.
}


