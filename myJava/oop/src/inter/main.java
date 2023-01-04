package inter;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);


          System.out.println("tutar belirle : ");

          double price = input.nextDouble();

          System.out.println("kart numarası giriniz : ");

          String cardNumber = input.next();

          System.out.println("kart son kullanma tarihi giriniz : ");

          String expiryDate = input.next();

          System.out.println("kart cvc giriniz : ");

          String cvc = input.next();

          

          System.out.println("1- a bankası \n 2- b bankası \n 3- c bankası");

          System.out.println("hangi banka");
          int select = input.nextInt();

          switch(select) {
               case 1 : 

                ABankasi aPos = new ABankasi("a bankası", "dfsdfsdf", "1234");
                aPos.connect("128.99.00");
                aPos.payment(price, cardNumber, expiryDate, cvc);
                break;
               case 2 : 
                default : 
                    System.out.println("yanlış seçim");



          }


     }
}
