package com.simicon;

import java.util.ArrayList;
import java.util.List;

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
        if(coinCurrency.equals("RUB")) {
            System.out.println("��� �����!");
        } else if (coinCurrency.equals("USD")) {
            System.out.println("��� �����!");
        } else {
            System.out.println("������ �� �������");
        }




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
    }
}
