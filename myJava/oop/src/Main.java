public class Main {
     public static void main(String[] args) {
          //Calisan c1 = new Calisan("elif emre", "534534535", "elffemre@gmail.com");

          //Akademisyen a1 = new Akademisyen("elif", "45435", "deneme@gmail.com", "bilgisayar", "doçent");

          //a1.giris();
          
          // superclass, supclassın özelliklerine erişemez
          // supclass, superclassın özelliklerine erişebilir

          //javada bir sınıf, sadece bir sınıftan kalıtım alabilir - sadece javada geçerli - c++ gibi dillerde birden fazla kalıtım alınabilir

         // Calisan m2 = new Memur("merve emre", "4534534", "patika@dev.com", "bilgi işlem", "12 saat");

          // m2.calis(); // calis() metodu memur sınıfında tanımlı olduğu için hata verir

          // calisan sınıfından yeni memur nesnesi oluşturuldu ama memur sınıfının özelliklerine erişilemiyor

          // çünkü calisan sınıfından yeni bir nesne oluşturulduğunda calisan sınıfının özelliklerine erişilebilir

         // Memur m1 = new Memur("yakup emre", "4534534", "patika@dev.com", "bilgi işlem", "12 saat");

          // m1.calis(); 


          OgretimGorevlisi og1 = new OgretimGorevlisi("yakup sarı", "434324", "cekapykp@gmail.com", "yazılım müh.", "doçent", "5 saat");

          og1.dersVer("12 saat"); // override edilmiş metot çağrıldı - akademisyen sınıfında override edildi
          
          //ogretim görevlisi hem akademisyenden hem de calısanın özelliklerine sahip

          //a1.giris(); // override edilmiş metot çağrıldı - akademisyen sınıfında override edildi
          //kendi içinde methodu geçersiz kıldı ve özelleştirdi

          //Çok biçimlilik - polymorphism

          //bir nesnenin birden fazla şekilde kullanılması


          //Calisan a2 = new Akademisyen("override", "45345", "elffemre", "bolümismi", "doktor");

          //a2.giris(); //ovverride edilmiş metot çağrıldı - akademisyen sınıfında override edildi - polymorphism
          // aslında calisan sınfından oluşturuldu 
          // a2.dersVer(); // akedemisyen sınıfında olmadığı için hata verir
          
          // polimorfizm - polymorphism - örnek

          //int[] loginUser = new int[5];
          //Calisan[] loginUser = {c1,a1,m1,og1}; // polymorphism - çok biçimlilik - bir nesnenin birden fazla şekilde kullanılması

          //Calisan.girisYapanlar(loginUser); // static metot çağrıldı - polymorphism 
          // polymorphism - çok biçimlilik - bir nesnenin birden fazla şekilde kullanılması

          // Abstract sınıflar - soyut sınıflar


          
          
     }
}
