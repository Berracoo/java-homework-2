package classes;

public class Main {
    public static void main(String[] args) {
        //reference type
        //iş yapan her şey classdır
        // class ların ilk temel özelliği gruplama yapmaktır
        CustomerManager customerManager; // bir class ı kullanabilmek için onu new ile yazmamız gerekiyor. new anahtar kelimesiyle sınıfın nesne halini alabiliriz.
        //böyle diyerek bellekte customerManager türünde bir nesne üretmiş oluyoruz.
        // tanımladığımz methodları kullanabilmek için nesneyi oluşturuyoruz.
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        // bunu dedikten sonra ilk customerManager için heapte yeni bir nesne oluşturamayız çümkü ikisi aynı nesneye eşit bir tane tanımlı olmalı.
       // çünkü referans tiplerine göre yerleştiriliyorlar ve aynı referans tipini aldıkları için farklı oluşturamayız.
       // eğer stack te bulunan referans tipine karşılık heapte bir nesne yoksa garbage collector onu gelip temizler.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        //value type
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2= sayi1;
        sayi1 = 30;
        System.out.println(sayi2);// üstte biri stack biri heapte iken burada sayi1=10 direk stackte bulunur. Çünkü değer tipli(primitive type)

        int[] sayilar1 = new int[]{1,2,3}; // new le tanımlandığı için bu da bir reference type çünkü nesne oluşturuyoruz.
        int[] sayilar2= new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);




    }

}
