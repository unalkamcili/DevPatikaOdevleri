import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler oluştur
        int mat, fizik, kimya , turkce, tarih, muzik;

        //Scanner sınıfını tanımla
        Scanner inp= new Scanner(System.in);

        //kullanıcıdan degerleri al
        System.out.println("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.println("fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.println("turkce notunuz : ");
        turkce = inp.nextInt();

        System.out.println("tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Muzik notunuz : ");
        muzik = inp.nextInt();

        int sonuc = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = sonuc/6;
        if (ortalama < 60 ){
            System.out.println("Öğrenci sınıfta kaldı : " + ortalama);
        }
        else {
            System.out.println("Öğrenci sınıfı geçti : " + ortalama);
        }

    }
}