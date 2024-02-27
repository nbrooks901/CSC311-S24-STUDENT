import java.util.Arrays;

//Nicole Brooks nbrooks6@toromail.csudh.edu

public class BubbleSort {
    private int[] array;  // The array to be sorted
    private int loopCount;  // Counter to keep track of loop cycles during sorting

    // Constructor that takes an array of integers as input
    public BubbleSort(int[] inputArray) {
        // Create a copy of the input array to avoid modifying the original array
        this.array = Arrays.copyOf(inputArray, inputArray.length);
        // Initialize loopCount to 0
        this.loopCount = 0;
    }

    // Method to perform bubble sort in ascending order
    public int[] sortAsc() {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            // Traverse the array and swap adjacent elements if they are in the wrong order
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    // Set swapped to true to indicate that a swap occurred
                    swapped = true;
                }
            }
            // Increment loopCount for each iteration of the do-while loop
            loopCount++;
        } while (swapped);

        // Return the sorted array
        return array;
    }

    // Method to perform bubble sort in descending order
    public int[] sortDesc() {
        int n = array.length;
        boolean swapped;

        do {
            swapped = false;
            // Traverse the array and swap adjacent elements if they are in the wrong order
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < array[i + 1]) {
                    // Swap arr[i] and arr[i+1]
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    // Set swapped to true to indicate that a swap occurred
                    swapped = true;
                }
            }
            // Increment loopCount for each iteration of the do-while loop
            loopCount++;
        } while (swapped);

        // Return the sorted array
        return array;
    }

    // Method to get the number of loop cycles during the last sort operation
    public int loopCycles() {
        return loopCount;
    }

    // Main method for testing the BubbleSort class
    public static void main(String[] args) {
        int[] inputArray = {23, 2, 3, 1000, 41, 63};
        BubbleSort bs = new BubbleSort(inputArray);

        System.out.println("Original Array: " + Arrays.toString(inputArray));

        // Perform ascending sort and display the result
        int[] sortedAsc = bs.sortAsc();
        System.out.println("Sorted Ascending: " + Arrays.toString(sortedAsc));
        System.out.printf("Loop Cycles for Ascending Sort: %d%n", bs.loopCycles());

        // Perform descending sort and display the result
        int[] sortedDesc = bs.sortDesc();
        System.out.println("Sorted Descending: " + Arrays.toString(sortedDesc));
        System.out.printf("Loop Cycles for Descending Sort: %d%n", bs.loopCycles());
    }
}