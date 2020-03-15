import java.util.*;
import java.io.*;

public class MyCalc {
    public static void main(String[] args) throws IOException {
        MyCalc cal = new MyCalc();
        File file = new File("input.txt");
        int[] A = cal.getData(file);    
    }
    public int[] getData(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        int[] dataArray = new int[150];
        int i = 0;
        while(scan.hasNextInt()) {
            dataArray[i] = scan.nextInt();
            i++;
        }
        return dataArray;
    }
}