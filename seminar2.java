// Дано число повторов 20 и символы "a" и "b". Напечатать из чередуя подряд n/2 раз
public class seminar2 {
    // Задача 1
    // public static void main(String[] args) {
    // int n = 30;
    // String a = "a";
    // String b = "b";
    // extracted(n, a, b);
    // }

    // private static void extracted(int n, String a, String b) {
    // StringBuilder result = new StringBuilder("");
    // for (int i = 1; i <= n/2; i++) {
    // result.append(a+b);
    // }
    // System.out.printf("%s\n", result.toString());
    // }

    // Задача 2
    // public static String zipStr(String str) {
    //     StringBuilder res = new StringBuilder();
    //     res.append(str.charAt(0));
    //     int count = 1;
    //     for (int i = 1; i < str.length(); i++){
    //         if (str.charAt(i) == str.charAt(i - 1)){
    //         count++;
    //         }else{
    //             if (count != 1) res.append(count);
    //             count = 1;
    //             res.append(str.charAt(i));
    //         }
    //     }
    //     if(count != 1) res.append(count);
    //     return res.toString();

    // }

    // public static void main(String[] args) {
    //     System.out.print(zipStr("aaaabbbbbbbbcddafffff"));
    // }

    // Задача 3
    // Напишите метод, который принимает строку (String) и определякт
    // является ли сторока полиндромом
    // public static void main(String[] args) {
    //     System.out.println(polindrom("122333444433322"));

    // }

    // private static boolean polindrom(String word) {
    //     int i1 = 0;
    //     int i2 = word.length()-1;
    //     while(i2 > i1) {
    //         if (word.charAt(i1) != word.charAt(i2)) {
    //             return false;
    //         }
    //         i1++;
    //         i2--;
    //     }
    //     return true;
    
    //}
    static boolean isPalindrom(String str) {
        String temp = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(temp); //equalsIgnoreCase чтобы игнолировать регистр
    }
    public static void main(String[] args) {
        System.out.print(isPalindrom(new String( "дОвод")));
    }
}
