//Задача 2
// Дана строка (получение через обычный текстовый файл!!!) - файл text.txt

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

import java.io.BufferedReader;
import java.io.FileReader;

public class task2_2 {
    public static void main(String[] args) throws Exception {

        String dataFile = "text.txt";
        String[] infoData;
        StringBuilder strBld = new StringBuilder();

        try {
            BufferedReader bufRead = new BufferedReader(new FileReader(dataFile));
            String line; {
                while ((line = bufRead.readLine()) != null) {
                    infoData = line.replace("\"", "").split(":|,");
                    strBld.append("Студент ").append(infoData[1]).append(" получил ").append(infoData[3])
                            .append(" по предмету ").append(infoData[5]).append(".\n");
                }
                System.out.println(strBld);
            }
            bufRead.close();
        }
        catch (Exception except) {
            except.printStackTrace();
        }
    }
}