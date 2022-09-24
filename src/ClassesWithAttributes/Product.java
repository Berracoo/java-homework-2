package ClassesWithAttributes;

public class Product { // attribute = özellik bir class aynı zamanda özellik

   // aslında her bir class ın kendi ismiyle bir constructor ı vardır.
      public Product(int id, String name, String description, double price, int stockamount, String renk){ // yapıcı method olarak düşünülebilir.
          // product ı bu parametreleri verirsen çalıştırabilirsin
        System.out.println("Yapıcı blok çalıştı");
        // aşağıda oluşturduğumuz alanları contructor la hızlıca oluşturabiliriz.
            this.id = id;
            this.name = name; // name i set etmediğimiz için String.substring te hata vermişti.
            this.stockAmount = stockamount;// bunları tanımladığımız için de parametrelerimiz çalışabilecek.
            this.price = price;
            this.renk = renk;
            this.description = description;

      }
      public Product(){ // bunu yazarak uzun olanı üstteki ile kısa olanı çalıştırırsın bi tane parametreli bi tane parametresiz isteyen istediğini kullanır.-> Buna overloading de deniyor

      }
    // barındırır
    // attribute/field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    private String renk;
    // burda yenibir özellik verdiğin zaman ProductManager daki gibi ekranı düzeltmene gerek yok bu özelliği kullanmak zorunda değilsin

    // bir class hem attribute hem de operasyonn içermemeli tek bir işi yapmalı bu diğer yapılar içinde geçerl
    //methodlar döngüler vb. single responsibility
    // public diğer sınıflarda da kullanılabilir demek
    // private sadece tanımlandığı blokta geçerlidir. yani sadece product ta

    //getter
    public int getId() { // private olduğu için sadece bu blokta erişebiliyorduk diğerlerinde de erişebilmek adına bunu kullandık burada sadece id yi okuyabilir yazdıramaz
        // sadece o amaçla değil class da belirttiğimiz özellikleri okuyup yazdırmak adına da kullandık.
        return id;
    }

    //setter
    public void setId(int id) { // id nin değerini kuruyor bize bir değer vermiyor .
        this.id = id;    // _ ile tanımlamamış olsaydık başına this. koyup eşitlerdik class daki ile parametredeki eşit olurdu.this koymadığımız zaman eğer private taysa id yi boş olarak algılar ve değeri 0 alır.
        // int id parametrisi verilmeli çünkü kullanıcı dan istiyoruz onu.
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public String getKod() {
        return this.name.substring(0,1) + id; //böyle yaparak kodu kullanıcının yapmasını engellemiş olduk.
                     // burada name in 0. indeksinden itibaren 1 elemanını alacak.
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
}


// get set birlikte kullanılmak zorunda değil readonly ya  da writeonly olarak kullanılabilir




