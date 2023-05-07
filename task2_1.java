// Задача 1.
//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.util.Arrays;

public class task2_1 {
    public static void main(String[] args) {
        StringBuilder strBuild = new StringBuilder();
        int[] arr = {-4, 7, -1, 0, 1, 2, 2, 18, -8, 3, 9, 2};
        int temp;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                strBuild.append(Arrays.toString(arr)).append("\n");
                try {
                    FileWriter flWrt = new FileWriter("log_file.txt", false); // false - чтобы перезаписать log_file
                    flWrt.write(strBuild.toString());
                    flWrt.close();
                } catch (Exception except) {
                    System.out.println("ОШИБКА!! Что-то пошло не так!!! Перевведите!! ");
                }  
            }
        }
    }
}
