package Arrays;

import java.util.*;

public class KthSmallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(kthSmallest(a, n));
        sc.close();
    }
    
    public static int kthSmallest(int[] arr, int k)
    { 
        Arrays.sort(arr);
        return arr[k-1];
    }
}