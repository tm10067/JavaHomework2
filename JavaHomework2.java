package JavaHomework2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class JavaHomework2 {
    public static void main(String[] args) {
        // Задание 1:
        String str1 = "янестарбратсеня";
        String str2 = "мамамылараму";
        System.out.println(palindromeCheck(str1)); // задание 1 true
        System.out.println(palindromeCheck(str2)); // задание 1 false
        // Задание 2:
        System.out.println(stringBuilder()); // задание 2 метод 1 составить строку
        String path = "OutputString.txt";
        writeToFile(stringBuilder(), path); // задание 2 метод 2 записать в файл
    }


//    Задание 1. Напишите метод, который принимает на вход строку (String)
//    и определяет является ли строка палиндромом (возвращает boolean значение).
    private static boolean palindromeCheck(String string) {
        Integer lastChar = string.length() - 1;
        for (int i = 0; i < lastChar / 2 + 1; i++) {
            if (string.charAt(i) != string.charAt(lastChar - i)) {
                return false;
            }
        }
        return true;
    }

//    Задание 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//    который запишет эту строку в простой текстовый файл, обработайте исключения.

    private static String stringBuilder() {
        String str = "TEST";
        int repeat = 100;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
                sb.append(str);
            }
        String result = sb.toString();
        return result;
    }

    private static void writeToFile(String string, String path) {
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.print(string);
        } catch (FileNotFoundException e) {
            System.out.printf("File not found" + e.getMessage());
        }
    }
}