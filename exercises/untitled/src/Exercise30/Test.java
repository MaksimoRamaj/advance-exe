package Exercise30;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public static void main(String[] args) {

        Path absolutePath = Paths.get("C:\\Users\\USER\\OneDrive\\Desktop\\SDA-BERAT\\exercises\\untitled\\src\\Exercise30");
        Path fileName = Paths.get("file.txt");
        String content = readFileAndReverse(absolutePath.toString()+ "\\" + fileName.toString());
        writeToFile(absolutePath.toString()+"\\"+reverseFileName(fileName.toString()),content);
    }

    static void writeToFile(String filePath,String content){
        File file = new File(filePath);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static String reverseFileName(String filePath){
        StringBuilder sb = new StringBuilder();
        int lastIndexOfDot = filePath.lastIndexOf(".");
        sb.append(filePath.substring(0,lastIndexOfDot));
        return sb.reverse().toString()+".txt";
    }

    static String readFileAndReverse(String filePath){
        StringBuilder content = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = bufferedReader.readLine())!=null){
                content.append(line);
                content.append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.reverse().toString();
    }
}
