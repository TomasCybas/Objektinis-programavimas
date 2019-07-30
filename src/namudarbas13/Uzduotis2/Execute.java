package namudarbas13.Uzduotis2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Execute {
    public static void main(String[] args) {
        try{
            File file = new File("data/namudarbas13/words.txt");
            Scanner sc = new Scanner(file);
            List <String> words = new ArrayList<>();

            while (sc.hasNext()){
                words.add(sc.next());
            }
            sc.close();
            List <String> newWords = new ArrayList<>();

            for (int i = 0; i <words.size(); i++){
                String str = words.get(i);
                if (str.contains(",")) {
                   str = str.replace(",", "");
                   words.set(i, str);
                }
                if (str.contains(".")){
                    str = str.replace(".", "");
                    words.set(i, str);
                }
            }

            for (String word : words) {
                if (word.endsWith("um")) {
                    newWords.add(word);
                }
            }
            words.sort(Collections.reverseOrder());
            System.out.println(words);
            System.out.println(newWords);

        }catch(FileNotFoundException e){
            System.out.println("Failas nerastas");
        }
    }

}
