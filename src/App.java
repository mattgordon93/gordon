import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {



        File file = new File("res/words.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        ArrayList<String> wordList = new ArrayList<>();
        //String word;
        String[] array = null;

        while (line != null){
            array = line.split("[ .,]+");
            for (int i = 0; i < array.length;i++){
                String word = new String(array[i]).toLowerCase();
            }
            line = bufferedReader.readLine();
        }
        for (int c = 0; c < array.length; c++){
            System.out.println(array[c]);
        }
        bufferedReader.close();
    }
}
