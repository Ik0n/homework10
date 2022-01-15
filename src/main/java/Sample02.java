import java.util.ArrayList;
import java.util.HashMap;

/**
 * Второе задание
 */
public class Sample02 {
    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "77777777777");
        phoneBook.add("Иванов", "88888888888");
        phoneBook.add("Иванов", "99999999999");
        phoneBook.add("Петров", "22222222222");
        phoneBook.add("Петров", "11111111111");
        phoneBook.add("Зябликов", "33333333333");
        phoneBook.add("Сидоров", "4444444444444");
        phoneBook.add("Чебуреков", "555555555555");
        phoneBook.add("Добрый вечер", "66666666666");
        phoneBook.add("Костыль", "11231231212");

        phoneBook.get("Петров");
        phoneBook.get("Иванов");
        phoneBook.get("Костыль");
        phoneBook.get("1");
        phoneBook.get("Зябликов");

    }




}

/**
 * Класс телефонной книги
 */
class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>(); // Хешмап для хранения фамилий и телефонных номеров

    /**
     * Метод добавления новых значение в справочник
     * @param surname фамилия
     * @param phoneNumber номер телфона
     */
    public void add(String surname, String phoneNumber) {

        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(phoneNumber);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(surname, phoneNumbers);
        }

    }

    /**
     * Метод для поиска телефонных номеров в справочнике по фамилии
     * @param surname фамилия которую ищем
     */
    public void get(String surname) {

        if (phoneBook.containsKey(surname)) {

            ArrayList<String> results = new ArrayList<>(phoneBook.get(surname));

            System.out.println("С фамилией " + surname + " имеються следующие номера");

            for (String phoneNumber : results) {
                System.out.println(phoneNumber);
            }


        } else {
            System.out.println("В справочнике нету номеров с такой фамилией");
        }

    }

}