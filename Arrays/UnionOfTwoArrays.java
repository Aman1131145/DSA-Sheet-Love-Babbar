package Arrays;

import java.util.*;

/**
 * UnionOfTwoArrays
 */
public class UnionOfTwoArrays {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        
        int ans = doUnion(a, n, b, m);
        System.out.println(ans);
        sc.close();
    }

    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> set = new HashSet<>();
        for(int i : a){
            set.add(i);
        }
        for(int j : b){
            set.add(j);
        }
        return set.size();
    }
}