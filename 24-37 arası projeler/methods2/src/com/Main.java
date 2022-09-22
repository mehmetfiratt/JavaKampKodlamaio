package com;

public class Main {

    public static void main(String[] args) {
        //bir metodun yapısı
        /*
            erişim_bildirgeci dönüş_tipi fonskion_adı(parametreler){
               gövde kısmı(Metodun yapacağı iş buraya yazılır)
               return ...; (metot bir değer döndürecek ise mutlaka return kullanılmalıdır)
            }

         Return kavramı => Çağrıldğı yere bir değer getiren metot türüdür (void hariç)
        void bir metotda return olmaz mı? Olur ama o return , bir değer getirmek için değil
        metodu bitirmek için(çalışmasını sonlandırmak için) kullanılır.

         */
        String message = "Bugün hava çok güzel";
        String city = getCity();
        System.out.println(city);
        update();
        System.out.println(divideByThree(20));
        int result = sum(1, 2, 3, 4, 5);
        System.out.println(result);
    }

    public static int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    private static String getCity() {
        return "Ankara";
    }

    public static void calculate() {
        System.out.println("Hesaplama bitti");
    }

    public static void update() {
//        if (true)
//            return;
        System.out.println("Güncelleme yapıldı");
    }

    public static double divideByThree(int number) {
        return (double) number / 3;
    }

}
