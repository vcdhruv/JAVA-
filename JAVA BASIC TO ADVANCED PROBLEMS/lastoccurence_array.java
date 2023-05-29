import ArrayOperations.array_operations;

public class lastoccurence_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[5];
        ao.inputArray(arr);
        ao.lastOccurence(arr, 1);
    }
}
