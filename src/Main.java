import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача 1");
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

        //task2
        System.out.println("Задача 2");
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

        //task3
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short paper = 480;
        int students = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperStudent = paper / students;
        System.out.println("На каждего ученика рассчитано " + paperStudent + " листов бумаги");

        //task4
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int bottlePerMinute = bottles / minutes;
        int twentyMinuteMachineWork =bottlePerMinute *  20;
        int oneHourMachineWork = twentyMinuteMachineWork * 3;
        int oneDayMachineWork = oneHourMachineWork * 24;
        int threeDaysMachineWork =oneDayMachineWork * 3;
        int oneMonthMachineWork =oneDayMachineWork * 30;
        System.out.println("За 20 минут машина произвела " + twentyMinuteMachineWork + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDayMachineWork + " штук бутылок");
        System.out.println("За 3 суток машина произвела " + threeDaysMachineWork + " штук бутылок");
        System.out.println("За месяц машина произвела " + oneMonthMachineWork + " штук бутылок");

        //task5
        System.out.println("Задача 5");
        int aTinOfPaint = 120;
        int whitePaintCanInClass = 2;
        int brownPaintCanInClass = 4;
        int classes = aTinOfPaint / (whitePaintCanInClass + brownPaintCanInClass);
        int needWhitePaintCan = whitePaintCanInClass * classes;
        int needBrownPaintCan = brownPaintCanInClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + needWhitePaintCan + " банок белой краски и " + needBrownPaintCan + " банок коричневой краски");

        //task6
        System.out.println("Задача 6");
        int weightOneBanana = 80;
        int bananas = 5;
        int weightFiveBananas = bananas * weightOneBanana;
        int twoHundredGramsOfMilk = 2;
        int oneHundredGramsOfMilk = 105;
        int totalMassOfMilk = twoHundredGramsOfMilk * oneHundredGramsOfMilk;
        int iceCreamSundae = 2;
        int iceCreamBriquetteWeight = 100;
        int weightIceCream = iceCreamSundae * iceCreamBriquetteWeight;
        int rawEggs = 4;
        int rawEggWeight = 70;
        int rawEggsWeight = rawEggWeight * rawEggs;
        int weightBreakfast = weightFiveBananas + totalMassOfMilk + weightIceCream + rawEggsWeight;
        int grPerKg = 1000;
        float weightBreakfastInKilo = weightBreakfast / (float)grPerKg;
        System.out.println("Вес завтрака спортсмена " + weightBreakfast + " грамм");
        System.out.println("Вес завтрака спортсмена " + weightBreakfastInKilo + " килограмм");

        //task7
        System.out.println("Задача 7");
        int lostWeightInKilo = 7;
        int lostWeightInGram = lostWeightInKilo * 1000;
        int lostWeightInDayMin = 250;
        int lostWeightInDayMax = 500;
        int minDayLost = lostWeightInGram / lostWeightInDayMin;
        int maxDayLost = lostWeightInGram / lostWeightInDayMax;
        double lostWeightInDayAverage =(lostWeightInDayMin + lostWeightInDayMax) / 2D;
        double averageDayLost = lostWeightInGram / lostWeightInDayAverage;
        System.out.println("Минимальное кол-во дней для похудания " + minDayLost);
        System.out.println("Максимальное кол-во дней для похудания " + maxDayLost);
        System.out.printf(Locale.US,"Среднее кол-во дней для похудания %.2f%n", averageDayLost);



        //task8
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristine = 76230;
        double salarySupplement = 1.1;
        double newSalaryMasha = salaryMasha * salarySupplement;
        double newSalaryDenis = salaryDenis * salarySupplement;
        double newSalaryKristine = salaryKristine * salarySupplement;
        double annualSalaryMasha = salaryMasha * 12;
        double annualSalaryDenis = salaryDenis * 12;
        double annualSalaryKristine = salaryKristine * 12;
        double newAnnualSalaryMasha = newSalaryMasha * 12;
        double newAnnualSalaryDenis = newSalaryDenis * 12;
        double newAnnualSalaryKristine = newSalaryKristine *12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (newAnnualSalaryMasha - annualSalaryMasha) + " рублей");
        System.out.printf(Locale.US ,"Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n", newSalaryDenis, newAnnualSalaryDenis - annualSalaryDenis);
        System.out.println("Кристина теперь получает " + newSalaryKristine + " рублей. Годовой доход вырос на " + (newAnnualSalaryKristine - annualSalaryKristine) + " рублей");

    }
}