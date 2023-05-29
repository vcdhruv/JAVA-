import ArrayOperations.array_operations;

public class sort_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[4];
        ao.inputArray(arr);
        ao.isSorted(arr);
    }
}
