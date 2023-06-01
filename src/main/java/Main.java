import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialNativeInterface;

public class Main {

    public static void main(String[] args) throws SerialPortException, InterruptedException {

        SerialPort serialPort = new SerialPort("COM3");
        serialPort.openPort();//Open serial port
        serialPort.setParams(4800, 8, 1, 0);//Set params.
        int i = 0;
        while(i < 10) {
            int[] buffer = serialPort.readIntArray(10);
            if(buffer!=null) {
                for(int b:buffer) {
                    System.out.print(b + "   ");
                }
            }
//            i++;
//            Thread.sleep(1000);
        }
    }
}