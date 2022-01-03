public class Main {

    public static void main(String[] args) {
	// write your code here
        atm Atm=new atm();
        hesap Hesap=new hesap("Mustafa Murat","12345",5000);
        Atm.calis(Hesap);
        System.out.println("Programdan Çıkılıyor...");
    }
}
