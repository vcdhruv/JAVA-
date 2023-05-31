import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {

    static boolean duplicateElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static int kthSmallestElement(int[] arr , int k){
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
        return arr[k-1];
    }

    static boolean equality(int[] arr,int[] arr2){
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr[i]!=arr2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, -1, 3, 2, -7, -5, 11, 6};
        int[] ans = new int[8];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]>=0) {
                ans[index]=arr1[i];
                index++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]<0) {
                ans[index]=arr1[i];
                index++;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

        System.out.println("\n"+"--------------------------");

        int m = 5;
        int n = 3;
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3};
        int[] res = new int[5];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (b[i]==res[j]) {
                    break;
                }else{
                    res[i]=b[i];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        int[] arr = {7, 10, 4, 3, 20};
        boolean check = duplicateElements(arr);
        if (check==false) {
            kthSmallestElement(arr, 1);
        }else{
            System.out.println("duplicate elements are there in your list");
        }


        int N = 5;
        int S = 12;
        int[] arr4 = {1,2,3,7,5};

        int i=0;
        int j=0;

        int sum = 0;
        while (j < N) {
            sum+=arr4[j];
            if (sum > S) {
                while (sum > S && i < j) {
                    sum-=arr4[i];
                    i++;
                }
            }
            if (sum == S) {
                System.out.println(i+" "+j);
                break;
            }
            j++;
        }

        int arr5[] = {2, 5, 7, 9, 11};
        int arr6[] = {2, 5, 7, 9, 13};

        if (equality(arr5, arr6)) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }

    }
}
