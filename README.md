# javaevim
ödevlerim
public class Urun {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("KDV'siz fiyat = " -yeni_fiyat);
         System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        int fiyat = scan.nextInt();
          double Kdvsiz_fiyat = fiyat + (fiyat * 10%);
        
        System.out.println("KDV'li fiyat = " + yeni_fiyat);
        System.out.print("Ürünün KDV tutarını giriniz: ");
        int fiyat = scan.nextInt();
       
         double kdvli_fiyat = fiyat + (fiyat * 13%);
        double yeni_fiyat = fiyat + (fiyat * 30%);
        
        System.out.println("KDV'li fiyat = " + yeni_fiyat);
    }
}
