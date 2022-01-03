import java.util.Scanner;

public class logIn {
    public boolean logIn( hesap Hesap){
        Scanner scanner=new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        System.out.println("Kullanıcı adı: ");
        kullaniciAdi=scanner.nextLine();
        System.out.println("Parola: ");
        parola=scanner.nextLine();
        if (Hesap.getKullaniciAdi().equals(kullaniciAdi) && Hesap.getParola().equals(parola)){
            return true;
        }
        else
            return false;

    }
}
