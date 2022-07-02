package Arrays;

import java.util.*;

public class h_MinimizeTheDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(getMinDiff(a, n, k));
        sc.close();
    }

    public static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int max = arr[n-1];
        int min = arr[0];
        int res = max - min;
        for(int i = 1; i< n; i++){
            max = Math.max(arr[n-1]-k, arr[i-1]+k);
            min = Math.min(arr[0]+k, arr[i]-k);
            if(min < 0){
                continue;
            }
            res = Math.min(res,max-min);
        }
        return res;
    }
}