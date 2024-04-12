package Enaira;

import java.io.*;

public class IO {


       public void write(String filename, String string){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(string);

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        }

       public void read(String filename){
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        }

}
