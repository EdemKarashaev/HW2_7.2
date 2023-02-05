import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    Set<String> set = new HashSet<>();
    //Конструктор, который разбирает поступивший текст в HashSet по словам
    public WordChecker(String text) {
        for (String val : text.split(" ")) {
            set.add(val);
        }
    }
    //проверка наличия слова в тексте
    public boolean hasWord(String str) {
        if (set.contains(str)) {
            return true;
        } else {
            return false;
        }
    }
}