

public class HarfNotuHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sinav notunu giriniz: ");
        double not = scanner.nextDouble();

        if (not >= 90) {
            System.out.println("Harf notu: AA");
        } else if (not >= 85) {
            System.out.println("Harf notu: BA");
        } else if (not >= 80) {
            System.out.println("Harf notu: BB");
        } else if (not >= 75) {
            System.out.println("Harf notu: CA");
        } else if (not >= 70) {
            System.out.println("Harf notu: CB");
        } else if (not >= 65) {
            System.out.println("Harf notu: CC");
        } else if (not >= 60) {
            System.out.println("Harf notu: DC");
        } else if (not >= 55) {
            System.out.println("Harf notu: DD");
        } else if (not >= 50) {
            System.out.println("Harf notu: FD");
        } else {
            System.out.println("Harf notu: FF");
        }
    }
}
