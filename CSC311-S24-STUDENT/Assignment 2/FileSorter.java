import java.util.Scanner;

//Nicole Brooks nbrooks6@toromail.csudh.edu

public class FileSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the input file name
        System.out.print("Enter the name of the input file: ");
        String inputFile = scanner.nextLine();

        // Ask the user for the output file name
        System.out.print("Enter the name of the output file: ");
        String outputFile = scanner.nextLine();

        // Read, sort, and write the file using NumberFileReader, BubbleSort, and NumberFileWriter classes
        NumberFileReader fileReader = new NumberFileReader(inputFile);
        int[] numbers = fileReader.read();

        BubbleSort bubbleSort = new BubbleSort(numbers);
        int[] sortedNumbers = bubbleSort.sortAsc();

        NumberFileWriter fileWriter = new NumberFileWriter(outputFile);
        fileWriter.write(sortedNumbers);

        System.out.println("File sorted successfully!");
        
        // Close the scanner
        scanner.close();
    }
}
