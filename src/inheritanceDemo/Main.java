package inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager()); // kredi hesapla için parametremiz base kredimanager olmasına rağmen ogretmen kredi manager ı kulanabiliyoruz çünkü o basekm dan miras alıyor. Onların referansını kendi içinde tutuyor.

    }
}
