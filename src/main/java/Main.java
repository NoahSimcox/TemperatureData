import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialNativeInterface;
import jssc.SerialPortList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SerialPortException{

        System.out.println("test");


        SerialPort serialPort = new SerialPort("USB\\ROOT_HUB20");
        serialPort.openPort();//Open serial port
        serialPort.setParams(9600, 8, 1, 0);//Set params

        int i = 0;
        while (i < 10) {
            byte[] buffer = serialPort.readBytes(10);
            if (buffer != null) {
                for (byte b : buffer) {
                    System.out.print(b + "   ");
                }
            }
            i++;
        }
    }
}