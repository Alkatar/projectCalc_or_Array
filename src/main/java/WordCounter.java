import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class WordCounter{
    /** Включена ли сортировка по длине слова. Если false, то сортирует по первой букве слова.  */
    static boolean lengthSorting = false;
    /** Файл, с которого мы берем текст */
    static File file;
    /** Путь к файлу*/
    static String inPath = "D:\\File.txt";
    static FileReader fR = null;
    static BufferedReader bR = null;



    /** Строка, считываемая в данный момент */
    static String line;

    /** Алфавит */
    static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    /** Текущее записываемое слово*/
    static String currentWord = "";
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
            while ((line = bR.readLine()) != null){
                //Для того, чтобы перенос строки так же воспринимался как новое слово
                words.add(currentWord);
                currentWord = "";

                for(int l = 0; l < line.length(); l++){
                    currentWord = currentWord + line.charAt(l);
                    if(line.charAt(l) == ' '){
                        words.add(currentWord);
                        currentWord = "";
                    }
                }
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


            /*
             * Выводим определенным образом наш список слов - либо сортируя по длине слова, либо сортируя по первой букве (как сортировать
             * по всем буквам сразу т.е. как например список файлов в Винде сортируется, я пока не смог понять, а искать решение в
             * Интернете - не то, ведь я это для себя делаю)
             * */


            if(lengthSorting){
                /* Сначала ищем все слова длиной 1 и выводим, потом длинной 2 и т.д. до
                 * самого длинного слова */
                for(int a = 1; a <= longestWord; a++){
                    for(int w = 0; w < words.size(); w++){
                        if(words.get(w).length() == a){
                            System.out.println(words.get(w));
                        }
                    }
                }
            } else {
                /* Здесь почти то же самое - ищем все слова на букву A, выводим, потом на букву B, потом C и т.д. до конца строки
                 * с  алфавитом */
                for(int a = 0; a < alphabet.length(); a++){
                    for(int w = 0; w < words.size(); w++){
                        if(words.get(w).toLowerCase().charAt(0) == alphabet.toLowerCase().charAt(a)){
                            System.out.println(words.get(w));

                        }
                    }
                }
            }

            System.out.println("\nЧисло повторений каждого слова в файле:\n");

            //Находим сколько раз каждое слово встречается в файле
            HashMap<String, Integer> wordToCount = new HashMap<>();
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