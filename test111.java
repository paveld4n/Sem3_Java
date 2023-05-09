import java.io.FileWriter;
import java.io.IOException;

public class test111 {
    public static void main(String[] args) throws IOException {
        int number = 1; // Целое число

// Создаем объект класса для записи в файл, передаем название файла,
// указываем, что данные будут дозаписываться в конец
// Используем конструкцию try-with-resources для автоматического закрытия потока
        try (FileWriter fileWriter = new FileWriter("1.txt", true)) {
            fileWriter.append(String.valueOf(number)); // Записываем число в файл, конвертируя число в строку
            fileWriter.flush(); // Очищаем буфер потока
        }

    }
}
