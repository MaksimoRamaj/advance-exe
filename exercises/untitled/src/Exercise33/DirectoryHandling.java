package Exercise33;

import java.io.File;

public class DirectoryHandling {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\USER\\OneDrive\\Desktop\\SDA-BERAT\\exercises\\untitled\\src\\Exercise33");
        if (file.isDirectory() && file.exists()){
            displayAllPhotos(file);
        }
    }


    static void displayAllPhotos(File directory){
        File[] dirs = directory.listFiles();
        for (File file:dirs){
            if (file.isDirectory()){
                displayAllPhotos(file);
            }else {
                if (file.getName().toLowerCase().endsWith(".png")||file.getName().toLowerCase().endsWith(".jpg")){
                    String fileName = file.getAbsolutePath();
                    System.out.println(fileName);
                }
            }
        }
    }
}
