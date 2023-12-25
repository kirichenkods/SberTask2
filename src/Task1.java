import java.util.*;
/**
 * Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать сколько раз встречается каждое слово.*/
public class Task1 {

    public static void main(String[] args) {
        String[] arrWords = new String[]{"Winter", "Summer", "Autumn", "Spring",
                "Autumn", "Winter", "Autumn", "Winter", "Spring", "Summer", "Winter",
                "Spring", "Autumn", "Winter", "Spring"};

        //уникальные значения
        Set<String> uniqueWords = new HashSet<>(List.of(arrWords));
        System.out.println(uniqueWords);

        //количество вхождений каждого слова
        Map<String, Integer> map = getCountWords(arrWords);
        System.out.println(map);
    }

    public static Map<String, Integer> getCountWords(String[] arrWords) {
        Map<String, Integer> result = new HashMap<>();
        for (String word : arrWords) {
            int count = Objects.isNull(result.get(word)) ? 0 : result.get(word);
            result.put(word, ++count);
        }

        return result;
    }
}



