package Exercise32;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileHandlingOperations {

    public static void main(String[] args) throws FileNotFoundException {

        List<Car> cars = Arrays.asList(
                new Car("AA 501 BR","BMW"),
                new Car("AB 303 BR","Audi"),
                new Car("AA 100 AC","Mercedes-Benz")
        );

        writeListToFile("C:\\Users\\USER\\OneDrive\\Desktop\\SDA-BERAT\\exercises\\untitled\\src\\Exercise32\\file.dat",cars);
        List<Car> readFromFile = readObjectsFromFile("C:\\Users\\USER\\OneDrive\\Desktop\\SDA-BERAT\\exercises\\untitled\\src\\Exercise32\\file.dat");

        for (Car car: readFromFile){
            System.out.println(car.marka + " " + car.targa);
        }
    }

    static <T extends Serializable> void writeListToFile(String filePath, List<T> itemList) throws FileNotFoundException {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))){
            for (T item : itemList){
                oos.writeObject(item);
            }
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Objekti u shkrua ne file!");
        }
    }

    static <T extends Serializable> List<T> readObjectsFromFile(String filePath){
        List<T> list = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))){
            while (true){
                try {
                    list.add((T)ois.readObject());
                }catch (EOFException e){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


}
