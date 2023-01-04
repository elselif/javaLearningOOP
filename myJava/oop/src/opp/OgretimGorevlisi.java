package opp;
public class OgretimGorevlisi extends Akademisyen{
     
     public String kapiNo;

     public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
          super(adSoyad, telefon, eposta, bolum, unvan);
          this.kapiNo = kapiNo;
     }

     public String getKapiNo() {
          return kapiNo;
     }

     public String setKapiNo(String kapiNo) {
          return this.kapiNo = kapiNo;
     }
     
     @Override
     public void dersVer(String dersSaati) {
          System.out.println(this.getAdSoyad() + " " + dersSaati + " öğretim görevlisi saatinde ders veriyor.");
     }
}
