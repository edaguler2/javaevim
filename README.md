public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fiyatı girin: ");
        double Fiyat = scanner.nextDouble();

        double kdvOran = 0.10;
        double kdv = 0;
        double kdvlıFiyat= 0;

        if (Fiyat >= 0 && Fiyat <= 1000) {
            kdv = Fiyat * kdvOran;
            kdvlıFiyat = Fiyat + kdv;
        } else if (Fiyat > 1000) {
            kdvOran = 0.22;
            kdv = Fiyat * kdvOran;
            kdvlıFiyat = Fiyat + kdv;
        }

        System.out.println("Fiyat: " + Fiyat);
        System.out.println("KDV Oran: " + kdvOran);
        System.out.println("KDV: " + kdv);
        System.out.println("Fiyat ve KDV: " + kdvlıFiyat);
    }
}
