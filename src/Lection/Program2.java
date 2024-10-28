package Lection;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Character.getName(i));
        }
        serialObj(list, "ser");

        ArrayList<String> list2 = null;
        list2 = (ArrayList<String>) deserialObj("ser.txt");
        System.out.println(list2);
    }
    public static void serialObj(Object o, String fileName) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
    }

    public static Object deserialObj(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }
}
