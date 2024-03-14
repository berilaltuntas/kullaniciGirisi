import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        String userName,password,newPassword;
        int choice;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName=input.nextLine();

        System.out.print("Şifreniz: ");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("dev123")) {
            System.out.println("Giriş Yaptınız.");
        }
        else if (userName.equals("patika") && !(password.equals("dev123"))) {
            System.out.println("Şifrenizi hatalı girdiniz.Şifrenizi sıfırlamak istiyorsanız 1'i tuşlayınız.");
            System.out.print("Seçiminiz: ");
            choice = input.nextInt();
            if (choice == (1)) {
                Scanner inp=new Scanner(System.in);
                System.out.print("Yeni Şifreniz: ");
                newPassword=inp.nextLine();
                    if (!(newPassword.equals("dev123"))) {
                        System.out.print("Yeni şifreniz başarıyla oluşturuldu.");
                    }
                    else if (newPassword.equals("dev123")) {
                        System.out.print("Şifreniz eski şifreniz ile aynı olamaz. Lütfen tekrar deneyiniz.");
                    }
            }
            else if (!(choice == 1)) {
                System.out.println("İşleminiz sonlandırıldı.");
            }
        }
        else {
            System.out.println("Bilgilerinizi yanlış girdiniz, lütfen tekrar deneyiniz.");
        }
    }
}