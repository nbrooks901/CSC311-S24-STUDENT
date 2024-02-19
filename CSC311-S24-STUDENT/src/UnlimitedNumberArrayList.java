import java.util.ArrayList;

//Nicole Brooks (nbrooks6@toromail.csudh.edu)
public class UnlimitedNumberArrayList {
    public static void main(String[] args) {
        
        UnlimitedNumberArrayList myList = new UnlimitedNumberArrayList();
        
        // Add some numbers to the list
        myList.add(234);
        myList.add(100);
        myList.add(43);
        myList.add(26);
        myList.add(1);
        myList.add(264);
        myList.add(321);
        myList.add(493);
        myList.add(104);
        myList.add(143);
        myList.add(4);
        myList.add(248);
        myList.add(6);
        myList.add(240);
        myList.add(358);
        myList.add(202);
        myList.add(86);
        myList.add(256);
        myList.add(77);

        // Print information about the NumberArrayList
        System.out.println("NumberArrayList: " + myList);
        System.out.println("Size: " + myList.size());
        System.out.println("Element at index 2: " + myList.get(2));
        System.out.println("Indices of 20: " + java.util.Arrays.toString(myList.find(20)));
        System.out.println("Largest: " + myList.getLargest());
        System.out.println("Smallest: " + myList.getSmallest());
        System.out.println("Average: " + String.format("%.2f", myList.getAverage()));
    }

    // Class implementation with methods below

    private ArrayList<Integer> numbers; // Internal ArrayList to store numbers
   

    // Constructor to initialize the NumberArrayList with a specified maximum size
    public UnlimitedNumberArrayList() {
        this.numbers = new ArrayList<>();
    }

    // Method to add a number to the list and return its index
    // Returns -1 if the list is full
    public int add(int number) {
            numbers.add(number);
            return numbers.size() - 1; // Index of the new entry
    }

    // Method to get the number at a specified index
    // Returns -1 if the index is invalid
    public int get(int index) {
        if (index >= 0 && index < numbers.size()) {
            return numbers.get(index);
        } else {
            return -1; // Indicates an invalid index
        }
    }

    // Method to get the current size of the list
    public int size() {
        return numbers.size();
    }

    // Method to find indices of a specified number in the list
    // Returns an empty array if the number is not found
    public int[] find(int number) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == number) {
                indices.add(i);
            }
        }

        int[] result = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            result[i] = indices.get(i);
        }

        return result;
    }

    // Method to get the largest number in the list
    // Returns -1 if the list is empty
    public int getLargest() {
        if (numbers.isEmpty()) {
            return -1;
        }

        int largest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        return largest;
    }

    // Method to get the smallest number in the list
    // Returns -1 if the list is empty
    public int getSmallest() {
        if (numbers.isEmpty()) {
            return -1;
        }

        int smallest = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < smallest) {
                smallest = numbers.get(i);
            }
        }

        return smallest;
    }

    // Method to calculate the average of numbers in the list
    // Returns -1 if the list is empty
    public double getAverage() {
        if (numbers.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.size();
    }

    // Override toString method to provide a custom string representation
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            result.append(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
