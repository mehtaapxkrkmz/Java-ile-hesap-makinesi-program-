
import java.util.Scanner;
public class hesap2{

        static void Topla(double sayi1,double sayi2){
            double sonuc=0;
            sonuc=sayi1+sayi2;
            System.out.println("Sonuç="+sonuc);
        }
        static void Cikar(double sayi1,double sayi2){
            double sonuc=0;
            sonuc=sayi1-sayi2;
            System.out.println("Sonuç="+sonuc);
        }
          static void Carp(double sayi1,double sayi2){
            double sonuc=0;
            sonuc=sayi1*sayi2;
            System.out.println("Sonuç="+sonuc);
        }
        static void Bol(double sayi1,double sayi2){
            double sonuc=0;
            sonuc=sayi1/sayi2;
            System.out.println("Sonuç="+sonuc);
        }
    public static void main(String[] args) {
        System.out.println("Hesap makinesi programına hoş geldiniz.");

        double sayi1,sayi2;
        double sonuc=0;
        char secim=' ';
        char karar=' ';
        Scanner giris=new Scanner(System.in);
        do{
        System.out.printf("1.sayıyı girin:");
        sayi1=giris.nextInt();
        System.out.printf("2.sayıyı girin:");
        sayi2=giris.nextInt();

        System.out.println("Lütfen işlem seçimi yapınız.");
        System.out.println("[1]:Toplama");
        System.out.println("[2]:Çıkarma");
        System.out.println("[3]:Çarpma" );
        System.out.println("[4]:Bölme");

        secim=giris.next().charAt(0);

        if(secim=='1'){
            Topla(sayi1,sayi2);
        }
        
        if(secim=='2'){
            Cikar(sayi1,sayi2); 
        }

          if(secim=='3'){
            Carp(sayi1,sayi2);
        }

         if(secim=='4'){
            Bol(sayi1,sayi2);
        }
        System.out.println("Tekrar işlem yapmak istiyor musunuz?(e/E)");
        karar=giris.next().charAt(0);

    }while(karar=='E' || karar=='e');
}
}