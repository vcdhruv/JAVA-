import java.util.Arrays;

import ArrayOperations.array_operations;

public class first_small_large_ele {
    static int[] smallestAndLargest(int[] elements){
        int[] answer = {elements[0],elements[elements.length-1]};
        return answer;
    }
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[5];
        ao.inputArray(arr);
        Arrays.sort(arr);
        int[] result = smallestAndLargest(arr);
        ao.printArray(result);
    }
}
