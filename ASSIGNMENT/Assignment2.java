public class Assignment2 {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, -5, -1, 0, 4, -9};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0 ) {
                System.out.println(arr1[i]);
            }
        }


        String[] arr2 = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for (int i = 0; i < arr2.length; i++) {
            if (i%2!=0) {
                System.out.println(arr2[i]);
            }
        }

        int[] arr3 = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]%2==0) {
                System.out.println(arr3[i]);
            }
        }

        int[] arr4 = {2, -3, 5, 8, 1, 0, -4};
        int ans = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = (i+1); j < arr4.length; j++) {
                if (arr4[j]<arr4[i]) {
                    ans = arr4[j];
                }
            }
        }
        System.out.println("Minimum Number is: "+ans);

        int[] arr5 = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i]>arr5[i-1] && arr5[i]>arr5[i+1]) {
                System.out.println(arr5[i]);
            }
        }
    }
}
