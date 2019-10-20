import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;


public class WordCounter{

    /** Файл, с которого мы берем текст */
    static File file;

    /** Путь к файлу*/
    static String inPath = "D:\\File.txt";
    static FileReader fR = null;
    static BufferedReader bR = null;

    /** Список слов */
    static ArrayList<String> words = new ArrayList<String>();

    /** Самое длинное слово */
    static int longestWord = 0;

    public static void main (String args []){
        try {
            file = new File(inPath);
            fR = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found at: " + inPath);
        }
        BufferedReader bR = new BufferedReader(fR);


        try {
            /* Запись в список слов:
             * Программа сначала считывает одну строку из файла, потом по 1 символу из этой строки добавляет в переменную currentWord, и
             * когда встретит пробел, то добавит currentWord в words и очистит текущее слово. Повторить до конца строки и потом повторить до
             * конца файла.
             * */
            Scanner fileScanner = new Scanner(new File(inPath));
            while (fileScanner.hasNextLine()){
                words.add(fileScanner.next());
            }

            // Чистка от пустых строк
            for(int f = 0; f < words.size(); f++){
                if(words.get(f).length() == 0){
                    words.remove(f);
                    f--;
                }
            }

            //Находим самое длинное слово
            for(int l = 0; l < words.size(); l++)
                if(words.get(l).length() > longestWord)
                    longestWord++;

            System.out.println("\nЧисло повторений каждого слова в файле:\n");

            //Находим сколько раз каждое слово встречается в файле
            TreeMap<String, Integer> wordToCount = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            for (String word : words)
            {

                if (!wordToCount.containsKey(word))
                {
                    wordToCount.put(word, 0);
                }
                wordToCount.put(word, wordToCount.get(word) + 1);
            }
            int maxCount = 0;
            String maxWord = null;
            for (String word : wordToCount.keySet())
            {
                System.out.println(word + " " + wordToCount.get(word));
                if (maxCount < wordToCount.get(word)) {
                    maxCount = wordToCount.get(word);
                     maxWord = word;
                }
            }

            System.out.println("Самое часто встречающееся слово в тексте: " + maxWord + "\n Частота появления слова в тексте = " + maxCount);
            
            fR.close();
            bR.close();
        } catch (IOException e) {
            System.out.println("Input/Output error: " + e.toString());
        }

    }
}