public class Memur extends Calisan {
     private String depertmant;
     private String mesai;

     public Memur(String adSoyad, String telefon, String eposta, String depertmant, String mesai) {
          super(adSoyad, telefon, eposta);
          this.depertmant = depertmant;
          this.mesai = mesai;
     }

     public String getDepertmant() {
          return depertmant;
     }

     public void setDepertmant(String depertmant) {
          this.depertmant = depertmant;
     }

     public String getMesai() {
          return mesai;
     }

     public void setMesai(String mesai) {
          this.mesai = mesai;
     }

     public void calis()
     {
          System.out.println(this.getAdSoyad() + " çalıştı.");
     }
     
}
