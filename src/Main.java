import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Kullanıcının gireceği not  değişkenlerimizi tanımladık.
        int mat, physical, chemical, turkish, music;

        //Kullanıcıdan ders notu değerlerini aldık.
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        physical = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        chemical = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkish = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        music = input.nextInt();

        //girilen dern notlarının ortalamasını hesapladık
        double avarage = (mat + physical + chemical + turkish + music) / 5;
        System.out.println("Ortalamanız :" + avarage); //ortalamayı ekrana yazdırdık

        //girilen değerlerin 0 ila 100 arasında olup olmadığını kontrol ettirdik.
        if ((mat >= 0 && mat <= 100) && (physical >= 0 && physical <= 100) && (chemical >= 0 && chemical <= 100) && (turkish >= 0 && turkish <= 100) && (music >= 0 && music <= 100)) {
            if (avarage <= 50) { //ortalama 50 den küçük ise koşulunu kontrol ettirdik
                System.out.println("Sınıfta kaldınız seneye tekrar görüşmek üzere !");
            } else {
                System.out.println("Tebrikler sınıfı geçtiniz :" + avarage);

            }
        } else {
            System.out.println("Ortalamaya katılamadınız !");
        }


    }
}