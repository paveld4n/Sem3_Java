// Заполнить список десетью случайныим числами. Отсортировать список методом sort() и вывести его наэкран

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Random;

// public class seminar3   {
//     public static void main(String[] args) {
//         int n = 10;
//         Random ran = new Random(0);
//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             arr.add(ran.nextInt(0, 100)); // add добавляет в конец если не указать номер индекса перед рандомом
//         }
//         System.out.println(arr);
//         arr.sort(null); // Сортировки пишутся через (list.sort.Comparator.naturalOrder() или list.sort.Comparator.reverseOrder()
//         System.out.println(arr);
//     }
// }
// Заполнить список названияимм планет в произвольном порядке с повторониями
// вывести название планеты и кол-во повторений
// public class seminar3 {
//     public static void main(String[] args) {
//         System.out.print("\033[H\033[2J"); // очищает сонсоль
//         int n = 15;
//         String[] planets = {"Меркурий", "Венера", "Марс", "Земля", "Нептун", "Юпитер"};
//         Random rd = new Random();
//         ArrayList<String> plnList = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             plnList.add(planets[rd.nextInt(planets.length)]);
//         }
//         System.out.println(plnList);
        // Вариант 1
        // int count = 0;
        // for (String elem1 : planets) {
        //     for (String elem2 : plnList) {
        //         if (elem1.equals(elem2)) count++;
        //     }
        //     if (count != 0)
        //     System.out.printf("%s: %d \n", elem1, count);
        //     count = 0;
        // }
        // 
        //Вариант 2
//         int count = 1;
//         plnList.sort(null);
//         for (int i = 1; i < plnList.size(); i++) {
//             if(plnList.get(i).equals(plnList.get(i - 1))) {
//                 count++;
//             }
//             else {
//                 System.out.printf("%s: %d \n", plnList.get(i-1), count);
//                 count = 1;
//             }
//         }

//         System.out.printf("%s: %d \n", plnList.get(plnList.size()-1), count);
//     }
// }
// Задача 3
// Создать ArrayList. Поместить в него строки и целые числа. Пройти па списку и целые числа убрать.
public class seminar3   {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        ArrayList <Object> arr = new ArrayList<>(Arrays.asList(0,"aaa", 1, 2, "pumto", 32, 32, "funk", 21/3.0, 21/2));
        for (int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) instanceof Integer) {
                arr.remove(i);
            }
        }
        System.out.println(arr);
    }    
}        