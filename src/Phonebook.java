import java.util.*;

public class Phonebook {
    private final Map<String, HashSet<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number) {
        HashSet<String> numbers = new HashSet<>();

        if (!phoneBook.containsKey(number)) {
            numbers.add(number);
        } else {
            numbers = phoneBook.get(surname);
            numbers.add(number);
        }

        phoneBook.put(surname, numbers);
    }

    public Set<String> get(String surname) {
        return phoneBook.containsKey(surname) ? phoneBook.get(surname) : new HashSet<>();
    }
}
