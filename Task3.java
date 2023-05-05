/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке. */

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Венера");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Нептун");
        planets.add("Юпитер");
        planets.add("Меркурий");
        planets.add("Земля");
        planets.add("Юпитер");

        
        int count1 = Collections.frequency(planets, "Меркурий");
        System.out.println("Меркурий: " + count1);
        int count2 = Collections.frequency(planets, "Венера");
        System.out.println("Венера: " + count2);
        int count3 = Collections.frequency(planets, "Земля");
        System.out.println("Земля: " + count3);
        int count4 = Collections.frequency(planets, "Марс");
        System.out.println("Марс: " + count4);
        int count5 = Collections.frequency(planets, "Юпитер");
        System.out.println("Юпитер: " + count5);
        int count6 = Collections.frequency(planets, "Сатурн");
        System.out.println("Сатурн: " + count6);
        int count7 = Collections.frequency(planets, "Уран");
        System.out.println("Уран: " + count7); 
        int count8 = Collections.frequency(planets, "Нептун");
        System.out.println("Нептун: " + count8);          
    }
}
