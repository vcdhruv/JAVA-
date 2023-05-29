import ArrayOperations.array_operations;

public class kth_largest_small_elem {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[5];
        ao.inputArray(arr);
        int[] result = ao.kthSmallestAndLargest(arr, 2);
        ao.printArray(result);
    }
}
