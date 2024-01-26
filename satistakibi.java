import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class satistakibi {

    public static void main(String[] args) {
        HashMap<String, Integer> salesData = new HashMap<>();
        salesData.put("Müşteri1", 100);
        salesData.put("Müşteri2", 200);
        salesData.put("Müşteri3", 300);
        salesData.put("Müşteri4", 400);
        salesData.put("Müşteri5", 500);

        Entry<String, Integer> topSeller = getTopSeller(salesData);
        System.out.println("En çok satış yapan müşteri: " + topSeller.getKey() + " - Satış miktarı: " + topSeller.getValue());
    }

    public static Entry<String, Integer> getTopSeller(HashMap<String, Integer> salesData) {
        return salesData.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
    }
}