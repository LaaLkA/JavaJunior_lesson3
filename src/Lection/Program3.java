package Lection;

import java.io.*;
import java.util.ArrayList;

class MyFCs implements Serializable {
    public String lName;
    public String fName;
    public String patronymic;

    public MyFCs(String lName, String fName, String patronymic) {
        this.lName = lName;
        this.fName = fName;
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return String.format("%s %s. %s.",
                lName,
                fName.toUpperCase().charAt(0),
                patronymic.toUpperCase().charAt(0));
    }
}

public class Program3 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*MyFCs myFCs = new MyFCs("Ivanov", "Ivan", "Ivanovich");
        serialObj(myFCs, "ser.txt");*/

        MyFCs myFCs = (MyFCs) deserialObj("ser.txt");
        System.out.println(myFCs);
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
