package task;

import java.io.*;

public class Task {
    public static void main(String[] args) throws Exception{
        File f = new File("text.txt");

         FileWriter fw = new FileWriter(f);
         fw.write("Hello world!");
         fw.write("\nHello world2");
         fw.write("\nHello world3");
         fw.close();

         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         String read;
         while((read = br.readLine())!= null){
             System.out.println(read);
         }
         fr.close();
    }
}
