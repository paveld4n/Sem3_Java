// Задача 3
// дополнительно. К калькулятору из предыдущего дз добавить запись в файл - файл 1.txt
// 1 + 3 = 4
// 4 + 3 = 7


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class task2_3 {
   public static void main(String[] args) throws IOException {
      int res;
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      int num1 = sc.nextInt();
      try (FileWriter fileWriter = new FileWriter("1.txt", true)) {
         fileWriter.append(String.valueOf(num1)); // Записываем число в файл, конвертируя число в строку
         fileWriter.write(" ");
         fileWriter.flush(); // Очищаем буфер потока
      }
      System.out.print("\nВведите арифметический оператор (+, -, *, /): ");
      char operation = sc.next().charAt(0);
      try (FileWriter fileWriter = new FileWriter("1.txt", true)) {
         fileWriter.append(String.valueOf(operation)); // Записываем число в файл, конвертируя число в строку
         fileWriter.write(" ");
         fileWriter.flush(); // Очищаем буфер потока
      }
      System.out.print("\nВведите второе число: ");
      int num2 = sc.nextInt();
      try (FileWriter fileWriter = new FileWriter("1.txt", true)) {
         fileWriter.append(String.valueOf(num2)); // Записываем число в файл, конвертируя число в строку
         fileWriter.write(" ");
         fileWriter.flush(); // Очищаем буфер потока
      }
      sc.close();
      switch(operation) {
         case '+': res = num1 + num2;
            break;
         case '-': res = num1 - num2;
            break;
         case '*': res = num1 * num2;
            break;
         case '/': res = num1 / num2;
            break;
         default:  System.out.printf("Ошибка при вводе");
            return;
      }
      try (FileWriter fileWriter = new FileWriter("1.txt", true)) {
         fileWriter.write(" = ");
         fileWriter.append(String.valueOf(res)); // Записываем число в файл, конвертируя число в строку
         fileWriter.write("\n");
         fileWriter.flush(); // Очищаем буфер потока
      }  
      System.out.print("\nРезультатом математического воздействия будет:\n");
      System.out.printf(num1 + " " + operation + " " + num2 + " = " + res);
   }
  
}
