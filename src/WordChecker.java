

import java.util.HashSet;
import java.util.Set;

public class WordChecker {
    protected String word;
    protected String text;
    Set<String> set = new HashSet<>();

    //Конструктор, который разбирает поступивший текст в HashSet по словам
    public WordChecker(String text) {
        this.text = text;
        for (String val : text.split(" ")) {
            set.add(val);
        }
    }

    //проверка наличия слова в тексте
    public boolean hasWord(String str) {
        word = str;
        if (set.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
}

  