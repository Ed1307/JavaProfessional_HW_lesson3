package task2;

import java.io.*;

public class Task2 {
    public static void main(String[] args) throws Exception{
        File f = new File("file.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("\nHello");
        fw.write("\nHello");
        fw.write("\nHello");
        fw.close();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        fr.close();
    }
}
