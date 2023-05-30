import ArrayOperations.array_operations;

public class target_sum_pair_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[6];
        ao.inputArray(arr);
        ao.printArray(arr);
        ao.targetSum(arr, 7);
    }
}
