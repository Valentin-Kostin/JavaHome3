/*Пусть дан произвольный список целых чисел, удалить из него четные числа */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task1 {
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
        removeInteger2(arr_num);
        System.out.println(arr_num);
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }
        return result;
    }

    static void removeInteger2(List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer object = (Integer) iterator.next();
            if (object % 2 == 0) {
                iterator.remove();
            }
        }
    }
}