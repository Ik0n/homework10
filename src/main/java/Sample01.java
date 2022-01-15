import java.util.ArrayList;
import java.util.HashSet;

/**
 * Первое задание
 */
public class Sample01 {

    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Яблоко");
        words.add("Персик");
        words.add("Яблоко");
        words.add("Виноград");
        words.add("Груша");
        words.add("Абрикос");
        words.add("Яблоко");
        words.add("Груша");
        words.add("Арбуз");
        words.add("Слива");

        HashSet<String> uniqueWords = new HashSet<>(words);

        for (String uniqueWord : uniqueWords) {

            int i = 0;

            System.out.print(uniqueWord);

            for (String word : words) {

                if (word.equals(uniqueWord))
                    i++;

            }

            System.out.println(" Слово встречается " + i + " раз");

        }

        System.out.println("*******************");

    }



}
