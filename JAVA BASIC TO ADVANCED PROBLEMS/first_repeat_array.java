import ArrayOperations.array_operations;

public class first_repeat_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[5];
        ao.inputArray(arr);
        ao.printArray(arr);
        ao.firstRepeatingValue(arr);
    }
}
