import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Nicole Brooks nbrooks6@toromail.csudh.edu

public class NumberFileWriter {
    public static void main(String[] args) {
        // Example usage
        int[] numbers = {56, 23, 89, 12, 45, 78, 34, 9, 67, 31};
        NumberFileWriter fw = new NumberFileWriter("./numberFileOut.txt");

        // Write numbers to the file
        fw.write(numbers);

        System.out.println("Numbers written to the file.");
    }

    private String fileName;

    // Constructor
    public NumberFileWriter(String fileName) {
        this.fileName = fileName;
    }

    // Method to write an array of numbers to the file, one value per line
    public void write(int[] arrayOfNumbers) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int number : arrayOfNumbers) {
                // Write each number to a new line in the file
                writer.write(Integer.toString(number));
                writer.newLine();
            }
        } catch (IOException e) {
            // Handle file writing exception, if needed
            e.printStackTrace();
        }
    }
}
