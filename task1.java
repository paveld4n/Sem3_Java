
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите положительное целое число: ");
        int n = sc.nextInt();
        System.out.printf("Вар.1 n - треугольное число = %d\n", giveMeNumber(n));
        int sum = 0;
        int factor = 1;
        while (n >= 1) {
            sum = sum + n;
            factor = n * factor;
            n--;
           
        }
        System.out.printf("Вар.2 n - треугольное число = %d. n! = %d", sum, factor);
        sc.close();

    }
    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
    
}
