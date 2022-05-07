package Algorithms;

import java.util.*;

/**
 * KadanesAlgorithm
 */
public class KadanesAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.print(kadanesAlgorithm(a, n));
        sc.close();
    }

    private static long kadanesAlgorithm(int[] arr, int n) {
        long sum=arr[0], ans=arr[0];
        for(int i=1;i<n;i++){
            sum+=arr[i];
            if(sum<arr[i]){
                sum=arr[i];
            } 
            ans=Math.max(ans,sum);
        }
        return ans;
    }


}