package day39_exceptions;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str = "123a5";

        int sayi = 0;
        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Yazdiğiniz deger sadece rakamlardan olusmalidir.");
        } catch (Exception e) {
            System.out.println("Ongorulemeyen bir hata olustu.");

        }


        System.out.println("Sayinin karesi : " + sayi*sayi);

        /*
        Kullanıcıdan String olarak bir değer alıyor ve bunu integer'a çeviriyorsak NumberFormatException ile
        karşılaşabileceğimizi öngörüyoruz.
        NFE aldığımızda kodun durmamasını istiyorsak try catch ile çevreleyebiliriz.

        Eğer bilmediğim bir exception daha oluşursa kodum durmasın istiyorsak
        bir kere daha catch cümlesi ekleyip ona en geniş Exception'i yazdırabiliriz.

         */


    }
}
