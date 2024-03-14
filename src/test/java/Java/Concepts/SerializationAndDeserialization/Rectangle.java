package Java.Concepts.SerializationAndDeserialization;

import java.io.Serializable;

public class Rectangle implements Serializable {

    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
