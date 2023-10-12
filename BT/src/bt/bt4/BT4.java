package bt.bt4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BT4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("src/bt/bt4/data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split("");
                for (String s : arr) {
                    list.add(s);
                }
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Collections.sort(list);

        System.out.println(list);

    }
}
