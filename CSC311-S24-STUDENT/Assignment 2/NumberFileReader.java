import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Nicole Brooks nbrooks6@toromail.csudh.edu

public class NumberFileReader {
    // Main method to run the program
    public static void main(String[] args) {
        // Instantiate NumberFileReader with the filename
        NumberFileReader fr = new NumberFileReader("numbers.txt");

        // Read numbers from the file
        int[] numbers = fr.read();

        // Print the numbers read from the file
        System.out.println("Numbers read from the file:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    // Private field to store the filename
    private String fileName;

    // Constructor to initialize the NumberFileReader with a filename
    public NumberFileReader(String fileName) {
        this.fileName = fileName;
    }

    // Method to read numbers from the file and return as an array of integers
    public int[] read() {
        // List to store the read numbers
        List<Integer> numbersList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                try {
                    // Parse each line to an integer and add to the list
                    int number = Integer.parseInt(line.trim());
                    numbersList.add(number);
                } catch (NumberFormatException e) {
                    // Handle invalid number format, if needed
                    System.err.println("Error parsing line: " + line);
                }
            }
        } catch (IOException e) {
            // Handle file reading exception, if needed
            e.printStackTrace();
        }

        // Convert the List<Integer> to int[]
        int[] numbersArray = new int[numbersList.size()];
        for (int i = 0; i < numbersList.size(); i++) {
            numbersArray[i] = numbersList.get(i);
        }

        // Return the array of numbers
        return numbersArray;
    }
}
