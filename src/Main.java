import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,secim = null;
        Scanner scanner = new Scanner(System.in);

        int hak = 3;
        int balance = 1500;

        while (hak > 0){
            System.out.print("Kullanici adiniz: ");
            userName = scanner.nextLine();

            System.out.print("Sifreniz: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Başarılı giriş");
             do {
                 System.out.println("Yapmak istediğiniz işlemi giriniz");
                 System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" +
                         "3-Bakiye Sorgulama\n" +"4-Çıkış Yap\n");
                 secim = scanner.nextLine();
                 if (secim.equals("1")) {
                     System.out.println("para yatirildi");
                 }
             }while (!secim.equals("4"));

                break;
            }else {
                hak--;
                System.out.println("hatalı giriş tekrar deneyiniz");
                if (hak > 0) {
                    System.out.println("hakkiniz: " + hak);
                } else {
                    System.out.println("hesabınız bloke olmuştur");
                }
            }
        }

    }
}