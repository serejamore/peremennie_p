package com.company;

public class Main {

    public static void main(String[] args) {
	//int;
    byte a = 12;
    long b = 111;
    short c = 50;
    float d = 5.5f;
    double e = 14;

float boxManFirst = 78.2f;
float boxmanSecond = 82.7f;
float totalWeight = boxManFirst + boxmanSecond;
System.out.println(" Общий вес двух боксёров " + totalWeight + " кг!");

float differenceWeight = boxmanSecond - boxManFirst;
System.out.println("Разница в весе между двумя бойцами " + differenceWeight + " кг!");

var bananas = 5;
var milk = 200;
var iceCream = 2;
var eggs = 4;
var totalProducts = bananas + milk + iceCream + eggs;

var bananasWeight = bananas * 80;
System.out.println("Все бананы весят  " + bananasWeight + " гр");

var milkWeight = 200;
var milkWeightHalf = 100;
var oneHungridMlMilk = 105;
var secondHalfMilk = milkWeight / milkWeightHalf;
System.out.println(secondHalfMilk);
var totalWeightMilk = secondHalfMilk * oneHungridMlMilk;
System.out.println("Общий вес молока " + totalWeightMilk + " гр");

var iceCreamOneBag = 100;
var totalWeightIceCream = iceCream * iceCreamOneBag;
System.out.println("общий вес мороженного " + totalWeightIceCream + " гр");

var oneEgg = 70;
var totalEggsWeight = oneEgg * eggs;
System.out.println("Общий вес яиц " + totalEggsWeight + " гр");

var totalWeigtIngridients = totalEggsWeight + totalWeightIceCream + totalWeightMilk + bananasWeight;
System.out.println(" Общий вес ингридиентов коктейля " + totalWeigtIngridients + " гр");

var oneKg = 1000;
var totalWeightIngridientsInKg = totalWeigtIngridients / oneKg;
System.out.println("Общий вес ингридиентов в килограммах " + totalWeightIngridientsInKg + " кг");

var needLoos = 7;
var needLoosInGr = needLoos * oneKg;
System.out.println("Необходимо сбросить в граммах " + needLoosInGr + " гр");

var ifOnFiveHungried = needLoosInGr / 500;
System.out.println("Если скидывать по 500 гр в день, то потребуется " + ifOnFiveHungried + " дней");
var ifOnTwoFiveZero = needLoosInGr / 250;
System.out.println("Если скидывать по 250 гр в день потребуется " + ifOnTwoFiveZero + " дней");

var middleDays = (ifOnFiveHungried + ifOnTwoFiveZero) / 2;
System.out.println("Среднее арифмитическое находим по формуле (А+Б)/2, где А - это если скидывать по 500гр, а Б - если скидывать по 250гр. Сумму делим на 2 и получаем " + middleDays + " день!" );

var mary = 67_760;
var den = 83_690;
var kris = 76_230;

var everyMountsUpMary = mary / 10;
System.out.println("Прирост зп Маши " + everyMountsUpMary + " руб/мес" );

var everyMountsUpDen = den / 10;
System.out.println("Прирост зп Дениса " + everyMountsUpDen + " руб/мес");

var everyMountsUpKris = kris / 10;
System.out.println("Прирост зп Кристины " + everyMountsUpKris + " руб/мес");

var moneyMaryNow = mary + everyMountsUpMary;
System.out.println("Зп Маши сейчас " + moneyMaryNow + "руб");

var differentMoneyMary = moneyMaryNow - mary;
System.out.println("Разница в месячной зп Маши " + differentMoneyMary + " руб");

System.out.println("У Кристины и Дениса разница в месячной зарплате между тем что было и что стало расчитываетсяя анлогично");

var moneyYearMaryAfter = mary * 12;
System.out.println("Зп Маши за год раньше составляла " + moneyYearMaryAfter + " руб");
var moneyYearMaryBefore = moneyMaryNow * 12;
System.out.println("Зп Маши за год сейчас составляет " + moneyYearMaryBefore + " руб");

var differentMoneyYearMary = moneyYearMaryBefore - moneyYearMaryAfter;
System.out.println("Разница в годовой зарплате Марии Ивановны составляет " + differentMoneyYearMary + " российских рублей");

System.out.println("Годовая зарплата коллег Марии Ивановны расчитывается аналогично и я понял схему расчетов");

    }
}
