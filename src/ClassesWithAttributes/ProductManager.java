package ClassesWithAttributes;

public class ProductManager {
    public void Add(Product product) {
        System.out.println("Ürün eklendi. "
                + product.getName());
    }
    public void Add2(int id, String name, String description, int stockAmount, double price){
  // bu tarz bir operasyon hatalıdır çünkü yeni bir özellik eklemek istediğiniz de kaç ekranda bu methodu kullandıysanız hepsinde ayrı ayrı düzenlemeniz gerekir.

    }

}
