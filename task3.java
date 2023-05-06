// Реализовать простой калькулятор

import java.util.Scanner;

public class task3 {
   public static void main(String[] args) {
      int res;
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите первое число: ");
      int num1 = sc.nextInt();
      System.out.print("\nВведите арифметический оператор (+, -, *, /): ");
      char operation = sc.next().charAt(0);
      System.out.print("\nВведите второе число: ");
      int num2 = sc.nextInt();
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
      System.out.print("\nРезультатом математического воздействия будет:\n");
      System.out.printf(num1 + " " + operation + " " + num2 + " = " + res);
   }
}
