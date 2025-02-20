package dataType;

public class ByteDataType {
    public static void main(String[] args) {
        byte myByte1 = 127; // unsigned no
        byte myByte2 = -48; // signed no
        System.out.println("Byte 1 = " + myByte1);
        System.out.println("Byte 2 = " + myByte2);

        myByte1++;
        System.out.println("Increamented value of myByte1 = " + myByte1);

        myByte2++;
        System.out.println("Increamented value of myByte2 = " + myByte2);
    }
}
