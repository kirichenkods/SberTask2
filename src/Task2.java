/*
* Написать простой класс ТелефонныйСправочник,
* который хранит в себе список фамилий и телефонных номеров.
* В этот телефонный справочник с помощью метода add() можно добавлять записи.
* С помощью метода get() искать номер телефона по фамилии.
* Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
* тогда при запросе такой фамилии должны выводиться все телефоны.*/
public class Task2 {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "+79001234567");
        phonebook.add("Petrov", "+79111114567");
        phonebook.add("Ivanov", "+79001112233");
        phonebook.add("Semenov", "+79012224588");

        System.out.println(phonebook.get("Petrov"));
        System.out.println(phonebook.get("Ivanov"));
        System.out.println(phonebook.get("Stepanov"));
    }
}
