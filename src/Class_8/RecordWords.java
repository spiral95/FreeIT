package Class_8;

//Задание: Создать метод, возвращающий все записи в которых содержится переданное слово.

import java.util.Scanner;

public class RecordWords {

    static String[] records =
                   {"insta post",
                    "blog backup",
                    "insta post - 2",
                    "finish project"};

    static String[] offer = new String[records.length];

    public static String method1(String word) {

        int k = 0;
        for (int i = 0; i < records.length; i++) {
            String[] words = records[i].split(" +");
            for (int j = 0; j < words.length; j++) {
                if(word.equals(words[j])){
                    offer[k] = records[i];
                    k++;
                }
            }
        }
        return offer[k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println(method1(word));
    }
}
