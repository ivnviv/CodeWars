package isFinished;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class WordGuesser {
        private List<String> dictionary;

        public WordGuesser(List<String> dictionary) {
            this.dictionary = dictionary;
        }

        public List<String> findMatchingWords(String pattern) {
            List<String> matchingWords = new ArrayList<>();

            for (String word : dictionary) {
                if (wordMatchesPattern(word, pattern)) {
                    matchingWords.add(word);
                }
            }

            return matchingWords;
        }

        private boolean wordMatchesPattern(String word, String pattern) {
            if (word.length() != pattern.length()) {
                return false;
            }

            for (int i = 0; i < word.length(); i++) {
                char wordChar = word.charAt(i);
                char patternChar = pattern.charAt(i);

                if (patternChar != '*' && wordChar != patternChar) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            // Здесь можно создать словарь со словами
            List<String> dictionary = new ArrayList<>();
            dictionary.add("МОЛОКО");
            dictionary.add("МОРКОВЬ");
            dictionary.add("МАЛЬЧИК");
            dictionary.add("МАКАРОНЫ");
            // Добавьте еще слова по своему усмотрению

            WordGuesser wordGuesser = new WordGuesser(dictionary);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите шаблон слова с символами '*' вместо неизвестных букв:");
            String pattern = scanner.nextLine();

            List<String> matchingWords = wordGuesser.findMatchingWords(pattern);
            if (matchingWords.isEmpty()) {
                System.out.println("Нет совпадающих слов в словаре.");
            } else {
                System.out.println("Совпадающие слова в словаре:");
                for (String word : matchingWords) {
                    System.out.println(word);
                }
            }
        }
    }

