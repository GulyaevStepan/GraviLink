package test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }

    /*
     * Задание 1.
     * Эта функция считает самый длинный участок одинаковых элементов в массиве.
     *
     * У этой реализации есть небольшая проблема:
     * неправильно работает с массивами, целиком состоящими из одинаковых элементов
     * или самый длинный участок одинаковых элементов в конце массива.
     * Исправить это конечно можно, например добавив дополнительную проверку.
     *
     * Несмотря, на вложенный цикл, сложность будет O(n),
     * т.к. если присмотреться, то так или иначе мы пройдемся по массиву 1 раз, полностью.
     * После моего исправления сложность не сильно изменится.
     * */
    static int myfunc(int[] a) {
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j] != a[i]) {
                    if (j - i > x) {
                        x = j - i;
                    }
                    i = j - 1;
                    break;
                } else if (j == a.length-1) {
                    if (j - i +1> x) {
                        return j - i+1;
                    }
                }
            }
        }
        return x;
    }

    /*
     * Задание 2.
     * Вспомним теорему Пифагора:
     * |A|^2 + |B|^2 = |C|^2
     * Применим её для всех 3 сторон треугольника.
     * С - вектор, котрый совмещает вершины А и В.
     * |A|^2 = x1^2 + y1^2 + z1^2
     * |B|^2 = x2^2 + y2^2 + z2^2
     * |C|^2 = (x1-x2)^2 + (y1-y2)^2 + (z1-z2)^2
     * Итого:
     * (x1^2 + y1^2 + z1^2) + (x2^2 + y2^2 + z2^2) ? (x1-x2)^2 + (y1-y2)^2 + (z1-z2)^2
     * */

    /*
     * Задание 3.
     * Представим, как систему уравнений.
     * {s = v1 * t1
     * {s = v2 * t2
     *
     * {v1 * 9 + v2 * 16 = v1 * (x + 9)
     * {v1 * 9 + v2 * 16 = v2 * (x + 16)
     * х - время до встречи поездов
     * {v2 = x * v1 / 16
     * {v1 = x * v2 / 9
     * 9 * 16 = x^2
     * x = 12
     * 15 - 12 = 3
     *
     * Ответ: 3 часа ночи.
     * */

    /*
     * Задание 4.
     * всего 6 * 6 = 36 комбинаций
     * общий капитал казино:
     * 100 * 1 + 90 * 2 + 80 * 3 + 50 * 4 = 720 р.
     * Среднее арифметическое: 720 / 36 = 20 р.
     * Ответ: Не более 20 рублей.
     * */

    //Задание 5.
    static int[] myTestFunc(int[] a) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            int x = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    ++x;
                }
            }
            if (x % 2 != 0) {
                list.add(a[i]);
            }
        }
        int[] b = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            b[i] = list.get(i);
        }
        return b;
    }
    /*
     * Сложность этого алгоритма будет O(n^2).
     * Или даже O(n^2+n)?
     * */
}
