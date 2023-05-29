import ArrayOperations.array_operations;

public class count_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[3];
        ao.inputArray(arr);
        ao.countElement(arr, 2);
    }
}
