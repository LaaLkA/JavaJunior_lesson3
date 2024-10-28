package Lection;

import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception {
        /*String str = "Всем привет!";
        FileOutputStream fileOutputStream = new FileOutputStream("ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(str);
        objectOutputStream.close();*/

        FileInputStream fileInputStream = new FileInputStream("ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        String s = (String) objectInputStream.readObject();
        System.out.println(s);
    }
}
