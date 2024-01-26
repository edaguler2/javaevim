import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public static final class OgrenciNot Takibi {
    private Map<String, Integer> mezun;

    public OgrenciNot Takibi() {
        mezun = new HashMap<>();
    }
}

    public void addStudent(String ad, int mezun) {
        mezun.put(ad, mezun);
        System.out.println("Ogrenci eklendi: " + ad + " - " + mezun);
    }

    public void mezungüncelle(String ad, int yenimezun) {
        if (mezun.containsKey(ad) ){
            mezun.put(ad, yenimezun);
            System.out.println("Ogrenci notu guncellendi: " + ad + " - " + yenimezun);
        } else {
            System.out.println("Ogrenci bulunamadi: " + mezun);
        }
    }

    public void getGrade(String name) {
        if (mezun.containsKey(name)) {
            System.out.println("Ogrenci notu: " + ad + " - " + mezun.get(ad));
        } else {
            System.out.println("Ogrenci bulunamadi: " + ad);
        }
    }

    public static void main(String[] args) {
        OgrenciNot Takibi tracker = new OgrenciNot Takibi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Ogrenci ekle\n2. Ogrenci notu guncelle\n3. Ogrenci notu sorgula\n4. Cikis");
            System.out.print("Seciminiz: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ogrenci adi: ");
                    String ad = scanner.next();
                    System.out.print("Ogrenci notu: ");
                    int mezun = scanner.nextInt();
                    tracker.ogenciekle(ad, mezun);
                    break;
                case 2:
                    System.out.print("Ogrenci adi: ");
                    ad = scanner.next();
                    System.out.print("Yeni ogrenci notu: ");
                    yenimezun = scanner.nextInt();
                    tracker.mezungüncelle(ad, yenmezun);
                    break;
                case 3:
                    System.out.print("Ogrenci adi: ");
                    name = scanner.next();
                    tracker.getGrade(name);
                    break;
                case 4:
                    System.out.println("Cikis yapiliyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gecersiz secim, tekrar deneyiniz.");
                    break;
            }
        }
    }
}