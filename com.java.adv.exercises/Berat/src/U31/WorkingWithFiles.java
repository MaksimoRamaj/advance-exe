package U31;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class WorkingWithFiles {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\USER\\OneDrive\\Desktop\\com.java.adv.exercises\\Berat\\src\\U31");
        Path fileToBeWritten = Paths.get("toBeWritten.txt");
        Path fileToBeRead = Paths.get("lorem.txt");

        Map<String,Integer> occurrences = readFromFile(path.toString()+"\\"+fileToBeRead);
        writeOnFile(path.toString()+"\\"+fileToBeWritten.toString(),occurrences);

    }


    static void writeOnFile(String filePath,Map<String,Integer> content){
        try(BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter(filePath))){
                for (Map.Entry<String,Integer> entry: content.entrySet()){
                    bufferedWriter.write("Key: " + entry.getKey() + " ,Value: " + entry.getValue());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    static Map<String,Integer> readFromFile(String filePath){
        Map<String,Integer> wordOccurrences = new TreeMap<>();
        try(BufferedReader bufferedReader =
                new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = bufferedReader.readLine())!=null){
                String[] arrayOfWords = line.split("\\s");
                for (String str:arrayOfWords){
                    if (!wordOccurrences.containsKey(str)){
                        wordOccurrences.put(str,1);
                    }else {
                        int actualOccurrences = wordOccurrences.get(str);
                        actualOccurrences++;
                       wordOccurrences.put(str,actualOccurrences);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wordOccurrences;
    }
}
