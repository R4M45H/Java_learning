package com.simicon;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // ���� ������, �����������, �������� � ����� (���������,������� ������)
        // ����� ������ �� ������, ���� ���������.

        // ����������
        boolean varBoolean = false; // �������� false �� ���������

        // �������������, �������� �� ��������� 0
        // 127 �.�. ��-�� �������� 0, �� ����� ������������� ����� ������ ������ �� 1
        byte varByte = 100; // 8 bit, -128 ... 127 (-2 ^ 7 ... (2 ^ 7) -1 )
        short varShort = 1000; // 16 bit, -321768 ... 321767
        int varInt = 100_000_000; // 32 bit, ������������ ���� �����
        long varLong = 0L; // 64 bit

        // ������
        char varChar = 'f'; // ��� ������� ����� ��� int

        // ����� � ��������� ������, 0.0 �������� �� ���������
        float varFloat = 0.0F; // ������������ ��� ����������� ����������
        double varDouble = 36.0; // ������������ ���� �����

        var aVar = 10; // var ��������� ��� ������ � ����������� �� ������������ ��������. ����������� �� �������������.

        // ��������� ��� ������, ���������������, �������� � ����, �� ���������� �������� ����� �����������, ��� ����� ����� ��� ������.
        // � ������ ����� ������ �������� ������� ������.
        // �� ��������� �������� null
        String varString = "Selenide";

        // ��������� ����� ����� ����� equals
        String varString1 = "Selenide";
        String varString2 = "Selenide";
        boolean eq = varString1.equals(varString2);

        // ���������
        // = ����������
        // ��������������
        int res = 4 + 4; // ��������� (expression)
        int res1 = 4 - 3;
        int res2 = 4 / 3; // ���������� ����� ����� ����� �������
        int res3 = 4 * 3;
        int res4 = 4 % 3; // ���������� �������
        int res5 = ++varInt; //  ++varInt - �������,varInt++ - ��������, ��� ++ ���������.

        int coinNaminal = 2;
        String coinCurrency = "RUB";

        int result = 0;
        result = result + 1; // ����� ������������ ������ ������
        result += 1; // ������ ��������� �������� �������������� �������
        result = ++result;

        // ��������� ���������: >, <, !=, >=, <=, ==,
        // ��������� ���� ������ ����������� �� ������������ (==), �.�. ���������� ��������� ������ ��������
        boolean result6 = varInt > 0;
        boolean result7 = Double.NaN == Double.NaN; // false

        // ���������� ���������
        // &&, ||, !, ^
        if (coinCurrency.equals("RUB")) {
            System.out.println("��� �����!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("��� �����!");
        } else {
            System.out.println("������ �� �������");
        }


        // ��� �������: ������������ � �������� ��������� ���� ������ �� ������� 200, 401, 400, 500, 404
        switch (coinCurrency) {
            case "RUB": {
                System.out.println("��� �����!");
                break;
            }
            case "USD": {
                System.out.println("��� �����!");
                break;
            }
            default: {
                System.out.println("������ �� �������");
            }
        }


        // ������������� �������.
        // ������ �������� ����� ������� ����� ��� �������������.
        // ������� �������� �������:
        int[] array = new int[3]; // int[] array = int[] {100, 150, -1}; [3] - ����� �������
        int[] array1 = new int[]{100, 150, -1, 90}; // ����� ������� 4
        // ��������� �� �������  0(100), 1(150), 2(-1), 3(90)
        int[] array2 = {0, 1, 2, 3};
        //array2[2] = 3213124; // ��������� �������� ������� � �������� 2
        System.out.println(array2[1]);
        System.out.println(array2.length); // lenght ���������� ����� �������

        // �������� ������� ��� �����
        String[] arrayStr = new String[]{"Dima", "Vasya"};

        int[] array3 = {100, 150, -1, 90};
        int[] array4 = {1, 34, -44, 55};

        // ��������� ������
        int[][] array5 = {array3, array4};
        System.out.println(Arrays.deepToString(array5));


        // �����

        //for
        for (int i = 0; i < array2.length; i++) { // ���� ����� <= �� ����� ����� �� ������� �������, � ���������� ������, �.�. ���� ������ 3
            System.out.println(array2[i]);     // ���� �����
        }


        for (int i = array2.length - 1; i >= 0; i--) { // ������� ������� � �����
            System.out.println(array2[i]);
        }


        // while - �� �������� � �������
        int index = 0;
        while (index < array2.length) { // ���� true ���� ����� ��������
            System.out.println(array2[index]);
            index++;
        }

//        boolean done = false;
//        while (!false) {
//            System.out.println(done);
//            // ���-�� ����
//            if (done == false) {
//                done = true;
//                System.out.println(done);
//            }
//
//        }
        boolean done = false;
        while (!done) {
            System.out.println(done);
            // ���-�� ����
            if (!done) { // ��� ����� ������������ if (done == false)
                done = true;
                System.out.println(done);
            }
        }

        // ������� ����������� �������, ����� ���������� ����
//        do {
//
//        } while (!false);

        // forEach
        for (int var : array2) { // array2 ������ ��������
            System.out.println(var);
        }
        // �������� ����� �����

        int[] array6 = new int[]{100, 150, -1, 90};
        for (int i = 0; i < array2.length; i++) {
            if (array6[i] == -1) {
                System.out.println("�����:" + array6[i]);
                break;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (array6[i] != -1) {
                continue;
            }
            // ������� ����������
            System.out.println("�����:" + array6[i]);
            break;
        }

//        public static void someMethod() {
//            for (int i = 0; i < array2.length; i++) {
//                if (array6[i] != -1) {
//                    return;
//                }
//        }

        //���������
        // List<Objects> - ������ ���� � java
        List<String> stringList = new ArrayList<>(); //<> - �������� ��� ������� ������� �������� ������ �����,
        // List - ���������, ArrayList - ������ ������������ ������ ���� �������
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

        Set<Integer> stringSet2 = new HashSet<>(); // ������ ������ ���������� ��������, �������� ���������� ��������� ��������.
        stringSet2.add(1);
//        stringSet2.add(1); // �� ��������� �.�. ������ ���������� �������� ���������.

        Map<String, Integer> aMap1 = new HashMap<>(); // ����� ����� ��� HashMap

        Map<Integer, Human> aMap = new HashMap<>(); // ����� ����� ��� HashMap
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
                System.out.println("����� �����: " + entry.getValue().getName());
            }
        }


//        aMap.containsKey();
//        aMap.get();

        someMethod(new String[]{"Dima", "Vasya"});
        someMethod1("Dima", "Vasya"); // ��� ����� ���������� ��������� ��� ���������� �����

        }
    public static String someMethod(String[] args) {
        return "" ;
    }

    public static String someMethod1(String... args) {
        return "" ;
    }

}
