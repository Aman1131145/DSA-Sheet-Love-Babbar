package Arrays;

import java.util.*;

public class Sort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        sort012(a, n);
        for(int i: a){
            System.out.print(i + " ");
        }
        sc.close();
    }
    public static void sort012(int a[], int n)
    {
        Arrays.sort(a);
    }
}
