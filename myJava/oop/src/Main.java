public class Main {
     public static void main(String[] args) {
          Calisan c1 = new Calisan("elif emre", "534534535", "elffemre@gmail.com");

          Akademisyen ak1 = new Akademisyen("elif", "45435", "deneme@gmail.com", "bilgisayar", "doçent");

          ak1.giris();
          
          // superclass, supclassın özelliklerine erişemez
          // supclass, superclassın özelliklerine erişebilir

          //javada bir sınıf, sadece bir sınıftan kalıtım alabilir - sadece javada geçerli - c++ gibi dillerde birden fazla kalıtım alınabilir

          Calisan m2 = new Memur("merve emre", "4534534", "patika@dev.com", "bilgi işlem", "12 saat");

          // m2.calis(); // calis() metodu memur sınıfında tanımlı olduğu için hata verir

          // calisan sınıfından yeni memur nesnesi oluşturuldu ama memur sınıfının özelliklerine erişilemiyor

          // çünkü calisan sınıfından yeni bir nesne oluşturulduğunda calisan sınıfının özelliklerine erişilebilir

          Memur m1 = new Memur("yakup emre", "4534534", "patika@dev.com", "bilgi işlem", "12 saat");

          m1.calis(); 


          OgretimGorevlisi og1 = new OgretimGorevlisi("yakup sarı", "434324", "cekapykp@gmail.com", "yazılım müh.", "doçent", "5");
          
          //ogretim görevlisi hem akademisyenden hem de calısanın özelliklerine sahip

     }
}
