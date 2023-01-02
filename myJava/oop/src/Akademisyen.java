public class Akademisyen extends Calisan { // extends ile kalıtım sağlandı
     
     //subclass ,superclass ile kalıtım yapıyorsa super classın constructoru çağrılmalı

     private String bolum;
     private String unvan;

     public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
          super(adSoyad, telefon, eposta); // super classın constructoru çağrıldı - ilk satırda olmalı
          this.bolum = bolum;
          this.unvan = unvan;

          
     }

     public String getBolum() {
          return bolum;
     }

     public void setBolum(String bolum) {
          this.bolum = bolum;
     }

     public String getUnvan() {
          return unvan;
     }

     public void setUnvan(String unvan) {
          this.unvan = unvan;
     }

     public void dersVer()
     {
          System.out.println(this.getAdSoyad() + " ders verdi.");
     }

     @Override

     public void giris() {
          System.out.println(this.getAdSoyad() + " akademisyen olarak giriş yapıyor.");
     }



}
