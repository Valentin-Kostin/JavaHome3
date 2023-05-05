/*Задан целочисленный список ArrayList. Найти минимальное, 
максимальное и среднее арифметическое из этого списка. Collections.max() */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите длину списка: ");
        int n = sc.nextInt();
        System.out.print("ВВедите минимальное число: ");
        int min = sc.nextInt();
        System.out.print("ВВедите максимальное число: ");
        int max = sc.nextInt();
        sc.close();
        List<Integer> arr_num = createList(n, min, max);
        System.out.println(arr_num);
        findMinMaxAverage(arr_num);
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }
        return result;
    }

    static void findMinMaxAverage(List list) {
        System.out.println("Минимальное число = " + Collections.min(list));
        System.out.println("Максимальное число = " + Collections.max(list));
        System.out.println("Среднее арифметическое число = " + getAverege(list));
    }

    private static int getAverege(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        int ave = sum / list.size();
        return ave;
    }
}
