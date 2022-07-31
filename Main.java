package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //If1. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; в противном случае не изменять его. Вывести полученное число
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if(a>0){
//            a = a + 1;
//            //a++; срабатывает после точки с запятой
//            //++a; срабатывает моментально
//            //a--;
//            //--a;
//        }
//        System.out.println(a);

        //If2. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; в противном случае вычесть из него 2. Вывести полученное число.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if (a>0){
//            a++;
//        }
//        else {
//            a=a-2;
        // или a-=2;
//        }
//        System.out.println(a);

        //If3. Дано целое число. Если оно является положительным, то прибавить к
        //нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
        //заменить его на 10. Вывести полученное число
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        if (a>0){
//            a++;
//        }
//        else {
//            if (a < 0) {
//                a = a - 2;
//            }
//            else {
//                a = 10;
//            }
//        }
//        System.out.println(a);

        //If4◦
        //. Даны три целых числа. Найти количество положительных чисел в исходном наборе.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int res = 0;
//        if (a>0){
//            res++;
//        }
//        if (b>0){
//            res++;
//        }
//        if (c>0){
//            res++;
//        }
//        System.out.println(res);

        //If5. Даны три целых числа. Найти количество положительных и количество
        //отрицательных чисел в исходном наборе.
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int res = 0;
//        if (a>0){
//            res++;
//        }
//        if (b>0){
//            res++;
//        }
//        if (c>0){
//            res++;
//        }
//        int otr = 0;
//        if (a<0){
//            otr++;
//        }
//        if (b<0){
//            otr++;
//        }
//        if (c<0){
//            otr++;
//        }
//        System.out.println(res);
//        System.out.println(otr);

        //If6◦
        //. Даны два числа. Вывести большее из них
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        if (a>b){
//            System.out.println(a);
//        }
//        else {
//            System.out.println(b);
//        }

        //If7. Даны два числа. Вывести порядковый номер меньшего из них
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        if (a<b){
//            System.out.println(1));
//        }
//        else { if(a>b){
//            System.out.println(2));
//        }
//            else {
//            System.out.println(=));
//        }
//        }
//
//        }
//        }

        //If8◦
        //. Даны два числа. Вывести вначале большее, а затем меньшее из них.
        /*Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a < b) {
            System.out.println(b);
            System.out.println(a);
        } else {
            if (a > b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println("числа равны");
            }
        }*/

        //If9. Даны две переменные вещественного типа: A, B. Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений,
        //а в B — большее. Вывести новые значения переменных A и B.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (b<a){
        int c=a;
        a=b;
        b=c;
        }
        System.out.println(a+ "" +b);*/

        //If10. Даны две переменные целого типа: A и B. Если их значения не равны,
        //то присвоить каждой переменной сумму этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения
        //переменных A и B.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a!=b){
            a=a+b;
            b=a;
        }
        else {
            a=0;
            b=0;
        }
        System.out.println(a);
        System.out.println(b);*/

        // If11. Даны две переменные целого типа: A и B. Если их значения не равны, то
        //присвоить каждой переменной большее из этих значений, а если равны,
        //то присвоить переменным нулевые значения. Вывести новые значения
        //переменных A и B.
        /*Scanner in = new Scanner (System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        if (A!=B){
            if (A>B){
                B=A;
            }
            else{
                A=B;
            }

        }
        else {
            A=0;
            B=0;
        }*/

        //If12◦
        //. Даны три числа. Найти наименьшее из них
//        Scanner in = new Scanner (System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        int res = 0;
//        if (a<b&&a<c) res = a;
//        else
//            if(b<a&&b<c) res = b;
//            else
//                if (c<a&&c<b) res = c;
//        System.out.println(res);

        //If13. Даны три числа. Найти среднее из них (то есть число, расположенное
        //между наименьшим и наибольшим).
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a>b&&a<c||a<b&&a>c) res = a;
        else if(b>a&&b<c||b<a&&b>c) res = b;
        else if (c<a&&c>b||c>a&&c<b) res = c;
        System.out.println("среднее число: " + res);*/

        //If14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из
        //данных чисел.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b&&a<c||a<b&&a>c) {
            if (b>c) {
                System.out.println(c);
                System.out.println(b);
            }
            else {
                System.out.println(b);
                System.out.println(c);
            }
        }
        else {
            if (b>a&&b<c||b<a&&b>c){
                if (a>c) {
                    System.out.println(c);
                    System.out.println(a);
                }
                else {
                    System.out.println(a);
                    System.out.println(c);
                }
            }
            else {
                if (c<a&&c>b||c>a&&c<b) {
                    if (a>b) {
                        System.out.println(b);
                        System.out.println(a);
                    }
                    else {
                        System.out.println(a);
                        System.out.println(b);
                    }
                }
            }
        }*/

        //If15. Даны три числа. Найти сумму двух наибольших из них.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a<b&&a<c) res = b+c;
        else if(b<a&&b<c) res = a+c;
        else if (c<a&&c<b) res = a+b;
        System.out.println(res);*/

        //If16. Даны три переменные вещественного типа: A, B, C. Если их значения
        //упорядочены по возрастанию, то удвоить их; в противном случае заме
        // нить значение каждой переменной на противоположное. Вывести новые
        //значения переменных A, B, C.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a<b&&b<c) {
            a = a*2;
            b=b*2;
            c=c*2;
        }
        else {
            a=-a;
            b=-b;
            c=-c;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        //If17. Даны три переменные вещественного типа: A, B, C. Если их значения
        //упорядочены по возрастанию или убыванию, то удвоить их; в против
        // ном случае заменить значение каждой переменной на противоположное.
        //Вывести новые значения переменных A, B, C.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a<b&&b<c)||(a>b&&b>c)) {
            a = a*2;
            b=b*2;
            c=c*2;
        }
        else {
            a=-a;
            b=-b;
            c=-c;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        //If18. Даны три целых числа, одно из которых отлично от двух других, равных между собой. Определить порядковый номер числа, отличного от
        //остальных.

        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a==b) res = 3;
        else if(a==c) res = 2;
        else res = 1;
        System.out.println(res);*/

        //If19. Даны четыре целых числа, одно из которых отлично от трех других,
        //равных между собой. Определить порядковый номер числа, отличного от
        //остальных.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int res = 0;
        if (a!=b&&a!=c) res = 1;
        else if(b!=a&&b!=c) res = 2;
        else if(c!=a&&c!=b) res = 3;
        else if(d!=a&&d!=b) res = 4;
        System.out.println(res);*/

        //If20. На числовой оси расположены три точки: A, B, C. Определить, какая из
        //двух последних точек (B или C) расположена ближе к A, и вывести эту
        //точку и ее расстояние от точки A.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if ((Math.abs(a-b))<(Math.abs(a-c))) {
            res = Math.abs(a-b);
            System.out.println("Точка b ближе к точке а, она равна: " + b + " и её расстояние от точки а равно: " + res);;
        }
        else {
            res = Math.abs(a-c);
            System.out.println("Точка c ближе к точке а, она равна: " + c + " и её расстояние от точки а равно: " + res);;
        }*/

        //If21. Даны целочисленные координаты точки на плоскости. Если точка совпа
        // дает с началом координат, то вывести 0. Если точка не совпадает с нача
        // лом координат, но лежит на оси OX или OY, то вывести соответственно 1
        //или 2. Если точка не лежит на координатных осях, то вывести 3.
        /*Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if ((a==0)&&(b==0)) System.out.println(0);
        else if (a==0) System.out.println(1);
        else if (b==0) System.out.println(2);
        else System.out.println(3);*/

        //If24. Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //f (x) = 2·sin(x), если x > 0,
        //6 − x, если x ≤ 0.
        /*Scanner in = new Scanner (System.in);
        double a = in.nextInt();
        double f=0;
        if (a>0) {
            f=2*Math.sin(a);
            System.out.println(f);
        }
        else {
            f=6-a;
            System.out.println(f);
        }*/

        //If26◦
        //. Для данного вещественного x найти значение следующей функции f,
        //принимающей вещественные значения:
        //−x, если x ≤ 0,
        //f (x) = x
        //2
        //, если 0 < x < 2,
        //4, если x ≥ 2.

        /*Scanner in = new Scanner (System.in);
        double a = in.nextInt();
        double f=0;
        if (a<0||a==0) {
            f=-a;
            System.out.println(f);
        }
        else {
            if (a>2||a==2) {
                f=4;
                System.out.println(f);
            }
            else {
                f=a*a;
                System.out.println(f);
            }
        }*/


    }
}










