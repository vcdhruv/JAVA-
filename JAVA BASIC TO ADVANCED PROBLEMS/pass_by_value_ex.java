import ArrayOperations.array_operations;

public class pass_by_value_ex {
    static int changeValue(int a){
        a = 1046;
        return a;
    }

    static int[] changeArray(int[] elements){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = 0;
        }
        return elements;
    }
    public static void main(String[] args) {
        array_operations ao = new array_operations();
        int a = 5;
        changeValue(a);
        System.out.println("value of a:"+a);
        int[] arr = new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        changeArray(arr);
        ao.printArray(arr);
    }
}
