package org.dmitrii;

public class Main {
    public static void main(String[] args) {

        // поупражняться с математическими и логическими операторами
        // добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)

        // переполнение
        byte bNum1 = 127;
        bNum1 += 1;
        byte bNum2 = -128;
        bNum2 -= 2;
        System.out.println("bNum1 = " + bNum1); // -128
        System.out.println("bNum2 = " + bNum2); // 126

        int iNum3 = 131;
        byte bNum4 = (byte) iNum3;
        System.out.println("bNum4 = " + bNum4); // -125


        System.out.println("######################");
        int n = 1;
        int x = 2;
        int count = 0;
        while (n > 0) {
            count++;
            System.out.println((n * x) + " count = " + count); // -2147483648 count = 31
            n = n * x;
        }
        System.out.println(n - 1); // 2147483647
        System.out.println("######################");

        short shortVar1 = 32767;
        short shortVar2 = 1;
        boolean boolVar1 = (short) (shortVar1 + shortVar2) > shortVar1;
        System.out.println("short 32767 + 1 > 32767? answer: " + boolVar1); // false
        System.out.println("short 32767 + 1 = " + (short) (shortVar1 + shortVar2)); // -32768


        // логические операторы
        System.out.println(true || false); // true
        System.out.println(false && false); // false
        System.out.println(!false && !false); // true
        System.out.println("4>3 AND 8>7 ? answer: " + (4>3 && 8>7)); // true
        System.out.println("4>3 AND 6>7 ? answer: " + (4>3 && 6>7)); // false
        System.out.println("4>3 AND !(6>7) ? answer: " + (4>3 && !(6>7))); // true
        System.out.println("4>3 OR 6>7 ? answer: " + (4>3 || 6>7)); // true
        System.out.println("!(4>3) OR 6>7 ? answer: " + (!(4>3) || (6>7))); // false





        // попробовать вычисления комбинаций типов данных (int и double)

//        int x = 120;
//        double y = 1.1;
//        System.out.println(x+y);
//        System.out.println(200+2000.2);
//        System.out.println(x/y);
//        System.out.println(x*y);
//        System.out.println(x%y);
    }
}