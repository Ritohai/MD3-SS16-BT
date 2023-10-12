package bt.bt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BT2 {
    public static void main(String[] args) {
        String fileName = "src/bt/bt2/data.txt";
        int lineCount = countLinesInFile(fileName);
        if(lineCount >= 0) {
            System.out.println("Số dòng là "+ lineCount);
        } else {
            System.out.println("Không đọc được file.");
        }

    }
    public static int countLinesInFile(String fileName) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
        return count;
    }
}
