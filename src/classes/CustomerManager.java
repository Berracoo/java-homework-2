package classes;

public class CustomerManager {
    public void Add(){ // static bir sınıfta tanımlanan değişkenlerin her bir nesne içinde kullanılmasınnı istedğimizde kullanırız.
        // yani classdan bir nesne yaratman gerekiyorsa
     System.out.println("Müşteri eklendi.");
    }
    public void Remove(){
        System.out.println("Müşteri silindi.");
    }
    public void Update(){
        System.out.println("Müşteri güncellendi.");
    }
}
