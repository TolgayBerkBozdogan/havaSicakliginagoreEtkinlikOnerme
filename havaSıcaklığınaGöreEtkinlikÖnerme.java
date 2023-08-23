import java.util.Scanner;

public class havaSıcaklığınaGöreEtkinlikÖnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int heat;
         System.out.print("Sıcaklık Değerini Giriniz: ");
         heat = input.nextInt();

        if (heat<5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if (heat<25) {
            if (heat<15) {
                System.out.print("Sinemaya gidebilirsiniz.");
            }
            else if (heat<25) {
                System.out.print("Piknik yapabilirsiniz.");
            }
        }else {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }

    }
}
