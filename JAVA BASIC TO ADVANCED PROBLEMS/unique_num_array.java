import ArrayOperations.array_operations;

public class unique_num_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[7];
        ao.inputArray(arr);
        ao.printArray(arr);
        ao.uniqueNumber(arr);
        ao.printArray(arr);
    }
}
