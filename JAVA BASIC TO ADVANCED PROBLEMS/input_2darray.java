import ArrayOperations.array_operations;

public class input_2darray {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[][] elements = new int[3][3];
        ao.inputArray2D(elements);
        ao.printArray2D(elements);
    }
}
