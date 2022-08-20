package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {
        /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem

        catch blo�unun �n�ndeki paranteze, kar��la�may� bekledi�imiz exception'� yazabilir veya
        her t�rl� exception'da devreye girmesini istiyorsak t�m exception'lar�n parent'i olan Exception yazabiliriz.
         */
            try {    // Men�'den ==> Code ==> Surround With... ==> try/catch
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }
            b--;
            sayac++;
        }
    }
}

