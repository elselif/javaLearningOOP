package inter;

public interface IBanka {
     //değişken tanımlanamaz ama abstractta değişken tanımlanabilir
     //final static değişken tanımlanabilir
     //metotlar publictir ve kod bloğu yazılmaz abstract gibi

     final String hostIpAdress = "128.99.00";

     boolean  connect(String ipAdress); // interface içindeki metotlar publictir. ve kod bloğu yazılmaz abstract gibi
     boolean payment(double Prise, String cardNumber, String expiryDate , String cvc);

     // BİR SINIFIN BİRDEN FAZLA İNTERFACE 'İ OLABİLİR
}
