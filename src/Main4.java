import java.io.*;

public class Main4 {
    public static void main(String[] args) {

       String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

       String path = "c:\\cobol\\out.txt";

       try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
           for (String line: lines){
               bw.write(line);
               bw.newLine();
           }
       }catch (IOException e){
           e.printStackTrace();
       }

    }
}
