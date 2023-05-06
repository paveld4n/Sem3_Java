// Вывести все простые числа от 1 до 1000
// Вариант первый
public class task2 {
    public static void main(String[] args) {
        int num = 1000;
        // System.out.println("Вариант первый через if - else");
        // for (int i = 2; i <= num; i++) {
        //     for (int j = 1; j < i; j++) {
        //         if (i % j == 0 ) {
        //             break;           
        //         }
        //         else if (j == (i-1)) {
        //             System.out.printf("%d, ", i);
        //         }
        //     }           
        // }

        // Вариант второй. По красоте.

        System.out.println("\nВариант второй через bool");
        boolean b = true;
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.printf("%d, ", i);
            else b = true;
        }          
    }   
}