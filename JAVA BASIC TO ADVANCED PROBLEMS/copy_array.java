import ArrayOperations.array_operations;

public class copy_array {
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        // copying the arr to arr_2
        int[] arr_2 = arr;

        System.out.println("Shallow Copy ( stored at same location )");
        System.out.println("Original Array");
        ao.printArray(arr);
        System.out.println("Copied Array");
        ao.printArray(arr_2);
        
        // changing some values of arr_2
        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("Original Array after changing value of copied array:");
        ao.printArray(arr);
        System.out.println("copied array after changing value of copied array:");
        ao.printArray(arr_2);

        int[] arr_4 = new int[3];

        arr_4[0]=8;
        arr_4[1]=9;
        arr_4[2]=3;

        int[] arr_3 = arr_4.clone();

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Deep Copy ( stored at different location )");
        System.out.println("Original Array");
        ao.printArray(arr_4);
        System.out.println("Copied Array");
        ao.printArray(arr_3);
        
        // changing some values of arr_3
        arr_3[0] = 0;
        arr_3[1] = 0;

        System.out.println("Original Array after changing value of copied array:");
        ao.printArray(arr_4);
        System.out.println("copied array after changing value of copied array:");
        ao.printArray(arr_3);
    }
}
