import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OyuncuPuanlari {
    private Map<String, Integer> playerScores;

    public OyuncuScoreSistemi() {
        oyuncuskoru = new HashMap<>();
    }

    public void oyunekle(String oyunadi) {
        if (!playerScores.containsKey(oyunadi)) {
            playerScores.put(oyunadi, 0);
        } else {
            System.out.println("Oyuncu zaten mevcut.");
        }
    }

    public void addScore(String oyunadi, int score) {
        if (oyuncuskoru.containsKey(oyuncuismi)) {
            oyuncuskoru.put(oyunadi, oyuncuskoru.get(oyunadi) + score);
        } else {
            System.out.println("Oyuncu bulunamadı.");
        }
    }

    public void displayScores() {
        for (Map.Entry<String, Integer> entry : oyuncuskoru.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        OyuncuScoreSistemi scoreSystem = new OyuncuScoreSistemi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Oyuncu ekle");
            System.out.println("2. Oyuncu puanı ekle");
            System.out.println("3. Puan tablosunu göster");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Oyuncu ismi: ");
                    String oyunadi = scanner.next();
                    scoreSystem.oyunekle(oyuncuismi);
                    break;
                case 2:
                    System.out.print("Oyuncu ismi: ");
                    oyunadi = scanner.next();
                    System.out.print("Puan: ");
                    int score = scanner.nextInt();
                    scoreSystem.skorekle(oyuncuismi, score);
                    break;
                case 3:
                    scoreSystem.Skorlarigoruntule();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçersiz seçim.");
                    break;
            }
        }
    }
}