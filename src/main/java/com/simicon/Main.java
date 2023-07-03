package com.simicon;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Типы данных, примитивные, хранятся в стэке (маленькая,быстрая память)
        // после выхода из метода, стэк очищается.

        // логический
        boolean varBoolean = false; // значение false по умолчанию

        // целочисленные, значение по умолчанию 0
        // 127 т.к. из-за хранения 0, по этому положительное число всегда меньше на 1
        byte varByte = 100; // 8 bit, -128 ... 127 (-2 ^ 7 ... (2 ^ 7) -1 )
        short varShort = 1000; // 16 bit, -321768 ... 321767
        int varInt = 100_000_000; // 32 bit, используется чаще всего
        long varLong = 0L; // 64 bit

        // символ
        char varChar = 'f'; // под копотом имеет тип int

        // числа с плавающей точкой, 0.0 значение по умолчанию
        float varFloat = 0.0F; // используется при оптимизации вычислений
        double varDouble = 36.0; // используется чаще всего

        var aVar = 10; // var принимает тип данных в зависимости от присвоенного значения. Практически не используюется.

        // Ссылочный тип данных, высокоуровневый, хранятся в хипе, за переменной хранится адрес указывающий, где можно найти эти данные.
        // С данным типом данных работает сборщик мусора.
        // по умолчанию значение null
        String varString = "Selenide";

        // сравнение строк через метод equals
        String varString1 = "Selenide";
        String varString2 = "Selenide";
        boolean eq = varString1.equals(varString2);

        // Операторы
        // = присвоения
        // математические
        int res = 4 + 4; // выражение (expression)
        int res1 = 4 - 3;
        int res2 = 4 / 3; // возвращает целое число после деления
        int res3 = 4 * 3;
        int res4 = 4 % 3; // возвращает остаток
        int res5 = ++varInt; //  ++varInt - префикс,varInt++ - постфикс, где ++ декримент.

        int coinNaminal = 2;
        String coinCurrency = "RUB";

        int result = 0;
        result = result + 1; // лучше использовать данный способ
        result += 1; // данное вырадение является синтаксическим сахаром
        result = ++result;

        // Операторы сравнения: >, <, !=, >=, <=, ==,
        // ссылочных типы данных практически не сравниваются (==), т.к. происходит сравнение ссылок объектов
        boolean result6 = varInt > 0;
        boolean result7 = Double.NaN == Double.NaN; // false

        // Логические операторы
        // &&, ||, !, ^
        if (coinCurrency.equals("RUB")) {
            System.out.println("Это рубль!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("Это долар!");
        } else {
            System.out.println("Ничего не подошло");
        }


        // для примера: используется в проверке получения кода ответа от запроса 200, 401, 400, 500, 404
        switch (coinCurrency) {
            case "RUB": {
                System.out.println("Это рубль!");
                break;
            }
            case "USD": {
                System.out.println("Это долар!");
                break;
            }
            default: {
                System.out.println("Ничего не подошло");
            }
        }


        // Инициализация массива.
        // Нельзя имзенять длину массива после его инициализации.
        // Способы создания массива:
        int[] array = new int[3]; // int[] array = int[] {100, 150, -1}; [3] - длина массива
        int[] array1 = new int[]{100, 150, -1, 90}; // длина массива 4
        // обращение по индексу  0(100), 1(150), 2(-1), 3(90)
        int[] array2 = {0, 1, 2, 3};
        //array2[2] = 3213124; // изменение элемента массива с индексом 2
        System.out.println(array2[1]);
        System.out.println(array2.length); // lenght отображает длину массива

        // Создание массива для строк
        String[] arrayStr = new String[]{"Dima", "Vasya"};

        int[] array3 = {100, 150, -1, 90};
        int[] array4 = {1, 34, -44, 55};

        // двумерный массив
        int[][] array5 = {array3, array4};
        System.out.println(Arrays.deepToString(array5));


        // циклы

        //for
        for (int i = 0; i < array2.length; i++) { // если будет <= то будет выход за пределы массива, и произойдет ошибка, т.к. макс индекс 3
            System.out.println(array2[i]);     // тело цикла
        }


        for (int i = array2.length - 1; i >= 0; i--) { // перебор массива с конца
            System.out.println(array2[i]);
        }


        // while - не привязан к индексу
        int index = 0;
        while (index < array2.length) { // пока true цикл будет работать
            System.out.println(array2[index]);
            index++;
        }

//        boolean done = false;
//        while (!false) {
//            System.out.println(done);
//            // что-то ищем
//            if (done == false) {
//                done = true;
//                System.out.println(done);
//            }
//
//        }
        boolean done = false;
        while (!done) {
            System.out.println(done);
            // что-то ищем
            if (!done) { // или можно использовать if (done == false)
                done = true;
                System.out.println(done);
            }
        }

        // сначала выполняется условие, потом начинается цикл
//        do {
//
//        } while (!false);

        // forEach
        for (int var : array2) { // array2 объект перебора
            System.out.println(var);
        }
        // ключевые слова цикла

        int[] array6 = new int[]{100, 150, -1, 90};
        for (int i = 0; i < array2.length; i++) {
            if (array6[i] == -1) {
                System.out.println("Нашли:" + array6[i]);
                break;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (array6[i] != -1) {
                continue;
            }
            // Сложное вычисление
            System.out.println("Нашли:" + array6[i]);
            break;
        }

//        public static void someMethod() {
//            for (int i = 0; i < array2.length; i++) {
//                if (array6[i] != -1) {
//                    return;
//                }
//        }

        //коллекции
        // List<Objects> - раньше было в java
        List<String> stringList = new ArrayList<>(); //<> - дженерик тип объекта который завернут внутри листа,
        // List - интерфейс, ArrayList - список использующий внутри себя массивы
        stringList.add("Dima"); //boxing
        stringList.addAll(Arrays.asList("Petr", "Ivan"));
        stringList.get(0);
//        stringList.sort(Comparator.comparing());
        stringList.remove("Petr");
        stringList.indexOf("Petr");
        stringList.stream()
                        .filter(s -> s.equals("Petr"))
                        .map(s -> s.toUpperCase());

        for (String var : stringList) { //unboxing
            System.out.println(var);
        }

        for (int i = stringList.size() -1; i >= 0; i--) { //unboxing
            System.out.println(stringList.get(i));
        }

        Set<Integer> stringSet2 = new HashSet<>(); // хранит только уникальные значения, проверка отсутствие повторных значений.
        stringSet2.add(1);
//        stringSet2.add(1); // не добавится т.к. только уникальные значения принимает.

        Map<String, Integer> aMap1 = new HashMap<>(); // Важно знать про HashMap

        Map<Integer, Human> aMap = new HashMap<>(); // Важно знать про HashMap
        aMap.put(343231, new Human("Petya", 33, "Male"));
        aMap.put(412412, new Human("Vladimir",23, "Male"));
        aMap.put(515214, new Human("Vladislav", 43, "Male"));

        aMap.keySet();
        aMap.values();

        Set<Integer> passportNumbers = aMap.keySet();
        Collection<Human> humans = aMap.values();

        Set<Map.Entry<Integer, Human>> entrySet = aMap.entrySet();
        for (Map.Entry<Integer, Human> entry : entrySet) {
            if (entry.getKey() == 343231) {
                System.out.println("Нашли Петра: " + entry.getValue().getName());
            }
        }


//        aMap.containsKey();
//        aMap.get();

        someMethod(new String[]{"Dima", "Vasya"});
        someMethod1("Dima", "Vasya"); // так можно передавать параметры для переменной длины

        }
    public static String someMethod(String[] args) {
        return "" ;
    }

    public static String someMethod1(String... args) {
        return "" ;
    }

}
