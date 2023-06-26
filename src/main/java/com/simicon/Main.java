package com.simicon;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // “ипы данных, примитивные, хран€тс€ в стэке (маленька€,быстра€ пам€ть)
        // после выхода из метода, стэк очищаетс€.

        // логический
        boolean varBoolean = false; // значение false по умолчанию

        // целочисленные, значение по умолчанию 0
        // 127 т.к. из-за хранени€ 0, по этому положительное число всегда меньше на 1
        byte varByte = 100; // 8 bit, -128 ... 127 (-2 ^ 7 ... (2 ^ 7) -1 )
        short varShort = 1000; // 16 bit, -321768 ... 321767
        int varInt = 100_000_000; // 32 bit, используетс€ чаще всего
        long varLong = 0L; // 64 bit

        // символ
        char varChar = 'f'; // под копотом имеет тип int

        // числа с плавающей точкой, 0.0 значение по умолчанию
        float varFloat = 0.0F; // используетс€ при оптимизации вычислений
        double varDouble = 36.0; // используетс€ чаще всего

        var aVar = 10; // var принимает тип данных в зависимости от присвоенного значени€. ѕрактически не используюетс€.

        // —сылочный тип данных, высокоуровневый, хран€тс€ в хипе, за переменной хранитс€ адрес указывающий, где можно найти эти данные.
        // — данным типом данных работает сборщик мусора.
        // по умолчанию значение null
        String varString = "Selenide";

        // сравнение строк через метод equals
        String varString1 = "Selenide";
        String varString2 = "Selenide";
        boolean eq = varString1.equals(varString2);

        // ќператоры
        // = присвоени€
        // математические
        int res = 4 + 4; // выражение (expression)
        int res1 = 4 - 3;
        int res2 = 4 / 3; // возвращает целое число после делени€
        int res3 = 4 * 3;
        int res4 = 4 % 3; // возвращает остаток
        int res5 = ++varInt; //  ++varInt - префикс,varInt++ - постфикс, где ++ декримент.

        int coinNaminal = 2;
        String coinCurrency = "RUB";

        int result = 0;
        result = result + 1; // лучше использовать данный способ
        result += 1; // данное вырадение €вл€етс€ синтаксическим сахаром
        result = ++result;

        // ќператоры сравнени€: >, <, !=, >=, <=, ==,
        // ссылочных типы данных практически не сравниваютс€ (==), т.к. происходит сравнение ссылок объектов
        boolean result6 = varInt > 0;
        boolean result7 = Double.NaN == Double.NaN; // false

        // Ћогические операторы
        // &&, ||, !, ^
        if(coinCurrency.equals("RUB")) {
            System.out.println("Ёто рубль!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("Ёто долар!");
        } else {
            System.out.println("Ќичего не подошло");
        }




        switch (coinCurrency) {
            case "RUB": {
                System.out.println("Ёто рубль!");
                break;
            }
            case "USD": {
                System.out.println("Ёто долар!");
                break;
            }
            default: {
                System.out.println("Ќичего не подошло");
            }
        }
    }
}
