import java.io.*;
import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        String path = "c:\\desafiojv\\in.txt";
        int quant = 0;
        float preco = 0;
        String produtos = "";
        StringBuilder outputBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();


            while (line != null) {
                System.out.println(line);
                String[] output = line.split(",");
                produtos = output[0];
                preco = Float.parseFloat(output[1]);
                quant = Integer.parseInt(output[2]);


                float calc = quant * preco;
                String resultLine = produtos + ", " + calc;
                outputBuilder.append(resultLine).append(System.lineSeparator());

                line = br.readLine();

            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        /*System.out.println(produtos);
        System.out.println(quant);
        System.out.println(preco);*/


        String pathFinal = "c:\\desafiojv\\out\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFinal))) {

            bw.write(outputBuilder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
