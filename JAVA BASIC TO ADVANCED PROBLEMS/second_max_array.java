import ArrayOperations.array_operations;

public class second_max_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[5];
        ao.inputArray(arr);
        ao.printArray(arr);
        ao.findSecondMax(arr);
        ao.printArray(arr);
    }
}
