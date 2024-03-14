package Java.Concepts.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerializationAndDeserialization {

    public static void main(String[] args) {

        try {
            Rectangle r = new Rectangle(20,10);
            FileOutputStream fout = new FileOutputStream("C:\\Users\\AnjKumar\\Serializable.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(r);
            System.out.println("Object is serialized.");
        } catch(Exception e) {
            System.out.println(e);
        }


        try {
            FileInputStream fin = new FileInputStream("C:\\Users\\AnjKumar\\Serializable.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            Rectangle rec = (Rectangle) oin.readObject();
            System.out.println("Length is : " + rec.getLength());
            System.out.println("Width is : " + rec.getWidth());
            System.out.println("Object is deserialized.");
        } catch(Exception e) {
            System.out.println(e);
        }


    }
}
