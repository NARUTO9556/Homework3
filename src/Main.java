// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        byte b = 4;
        short s = 32;
        int i = 525;
        long l = 360L;
        float f = 62.35f;
        double d = 65.44;
        System.out.println("Значение переменной b с типом byte равно " + b );
        System.out.println("Значение переменной s с типом short равно " + s );
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l );
        System.out.println("Значение переменной f с типом float равно " + f );
        System.out.println("Значение переменной d с типом double равно " + d );

        float weigth = 27.12f;
        long moneyCase = 987678965549L;
        double heigth = 2.786;
        short money = 569;
        short balanceBankCard = -159;
        int price = 27897;
        byte pence = 67;
        System.out.println(weigth);
        System.out.println(moneyCase);
        System.out.println(heigth);
        System.out.println(money);
        System.out.println(balanceBankCard);
        System.out.println(price);
        System.out.println(pence);

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int students = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperStudent = paper / students;
        System.out.println("На каждего ученика рассчитано " + paperStudent + " листов бумаги");

        byte oneMinuteMashine = 8;
        int twentyMinuteMashine = 20;
        int time1 = oneMinuteMashine * twentyMinuteMashine;
        int oneDayMashine = 1440;
        int time2 = oneMinuteMashine * oneDayMashine;
        int threeDaysMashine =3;
        int time3 = time2 * threeDaysMashine;
        int oneMonthMashine = 30;
        int time4 = time2 * oneMonthMashine;
        System.out.println("За " + twentyMinuteMashine + " минут машина произвела " + time1 + " штук бутылок");
        System.out.println("За " + oneDayMashine + " минут машина произвела " + time2 + " штук бутылок");
        System.out.println("За " + threeDaysMashine + " суток машина произвела " + time3 + " штук бутылок");
        System.out.println("За " + oneMonthMashine + " дней машина произвела " + time4 + " штук бутылок");

        int aTinOfPaint = 120;
        int whitePaintCanInClass = 2;
        int brownPaintCanInClass = 4;
        int paintCanInClass = whitePaintCanInClass + brownPaintCanInClass;
        int classes = aTinOfPaint / paintCanInClass;
        int needWhitePaintCan = whitePaintCanInClass * classes;
        int needBrownPaintCan = brownPaintCanInClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + needWhitePaintCan + " банок белой краски и " + needBrownPaintCan + " банок коричневой краски");

        int weightOneBanana = 80;
        int bananas = 5;
        int weightFiveBananas = bananas * weightOneBanana;
        int milk = 200;
        int oneHundredGramsOfMilk = 105;
        int twoHundredGramsOfMilk = milk * oneHundredGramsOfMilk;
        int iceCreamSundae = 2;
        int iceCreamBriquetteWeight = 100;
        int weightIceCream = iceCreamSundae * iceCreamBriquetteWeight;
        int rawEggs = 4;
        int rawEggWeight = 70;
        int rawEggsWeight = rawEggWeight * rawEggs;
        int weightBreakfast = weightFiveBananas + twoHundredGramsOfMilk + weightIceCream + rawEggsWeight;
        int grPerKg = 1000;
        float weightBreakfastInKilo = weightBreakfast / (float)grPerKg;
        System.out.println("Вес завтрака спортсмена " + weightBreakfast + " грамм");
        System.out.println("Вес завтрака спортсмена " + weightBreakfastInKilo + " килограмм");


    }
}