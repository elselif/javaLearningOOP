package inter;

public class ABankasi implements IBanka {
     private String bankaAdi;
     private String terminal_id;
     private String password;

     public ABankasi(String bankaAdi, String terminal_id, String password) {
          this.bankaAdi = bankaAdi;
          this.terminal_id = terminal_id;
          this.password = password;
     }

     @Override
     public boolean connect (String ipAdress) {
          System.out.println("kullanıcı ip adress " + ipAdress);
          System.out.println("makina ip " + this.hostIpAdress);
          System.out.println("a bankası bağlantısı kuruldu");
          return true;
     }
     
     @Override
     public boolean payment(double Prise, String cardNumber, String expiryDate , String cvc) {
          System.out.println("a bankası ödeme işlemi gerçekleşti");
          return true;
     }



     

     public String getBankaAdi() {
          return bankaAdi;
     }

     public void setBankaAdi(String bankaAdi) {
          this.bankaAdi = bankaAdi;
     }

     public String getTerminal_id() {
          return terminal_id;
     }

     public void setTerminal_id(String terminal_id) {
          this.terminal_id = terminal_id;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }



}
