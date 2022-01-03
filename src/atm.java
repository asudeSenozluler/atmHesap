import jdk.jshell.Snippet;

import java.util.Scanner;

public class atm {
    public void calis( hesap Hesap){
        logIn Login=new logIn();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bankamıza Hoş Geldiniz....");
        System.out.println("**************************");
        System.out.println("Kullanıcı Girişi: ");
        System.out.println("**************************");
        int girisHakki=3;
        while (true){
            if (Login.logIn(Hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else
                System.out.println("Giriş Başarısız");
            girisHakki-=1;
            System.out.println("Kalan Giriş Hakkı:"+girisHakki);
        if (girisHakki==0){
            System.out.println("Giriş hakkınız Bitti!");
            return;
        }



        }
        System.out.println("**************************************");
        String islemler="1.İşlem: Bakiye Öğrenme"+
                "2.İşlem:Para Yatırma /n"+
                "3.İşlem:Para Çekme /n"+
                "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("*****************************************");
        while (true){

            System.out.println("İşlem Seçiniz:");
            String islem= scanner.nextLine();
            if (islem.equals("q")){
                break;
            }
           else if (islem.equals("1")){
                System.out.println("Bakiyeniz:"+Hesap.getBakiye());

            }
           else if (islem.equals("2")){
                System.out.println("Yatırmak İstediğiniz Tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                Hesap.paraYatır(tutar);
            }
           else if (islem.equals("3")){
                System.out.println("Çekmek İstediğiniz Tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                Hesap.paraCek(tutar);

            }
           else
                System.out.println("Geçersiz İşlem!!!");

        }









    }

}
