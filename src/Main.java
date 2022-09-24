public class Main {
    public static void main (String[] args){
       sayiBulmaca(); // burada sayı bulmacayı çağır dedik böylece o method çalışacak
        // javada direkt olarak main kodu çalışır ve mainden dallanır.
        // main in içine hiçbir şey yazmamış olsaydık kod çalışmazdı
    }
    // methodlar ile fonksiyon yazarak kendimizi tekrarlamayı önlemiş oluruz.

    public static void sayiBulmaca(){ // main ile sayiBulmaca birer method
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false; // ilk başta sayı yok gibi aldık.

        for (int sayi:sayilar){
            if(sayi==aranacak){
                varMi = true;
                break; // aramasına gerek yoksa döngü biter.
            }
        }
        String mesaj ="";
        if(varMi){
            mesaj = "Sayı mevcuttur: "+aranacak;
           mesajVer(mesaj); //paranteze mesaj olan ifadeyi vermeliyiz ki mesaj ver dinamik çalışsın çalışsın
        }else{                                //ifademiz mesaj ile aynı olmak zorunda değil aynı tür olması yeterli
           mesajVer("Sayı mevcut değildir: "+aranacak);
        }
    }
    public static void mesajVer(String mesaj){// parametreli method
        //fonksiyonun çalışabilmesi için String türünde bir parametreye ihtiyacı var
        System.out.println(mesaj); //her seferinde yazmamak adına method yaptık
    }
}
