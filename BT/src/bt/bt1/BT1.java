package bt.bt1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BT1 {
    public static void main(String[] args) {
        String fileName = "src/bt/bt1/data.txt";
        String fileContent = readFileContent(fileName);
        if (fileContent != null) {
            String[] words = fileContent.split("\\s+"); // Tách nội dung thành mảng các từ
            int wordCount = words.length;
            System.out.println("Số lượng từ trong file: " + wordCount);
        } else {
            System.out.println("Không thể đọc file.");
        }
    }

    public static String readFileContent(String file) {
        StringBuilder content = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line ;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }
}
