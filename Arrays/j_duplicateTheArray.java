package Arrays;

import java.util.*;

public class j_duplicateTheArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = duplicates(a,n);
            for (Integer val : ans) {
                System.out.println(val+" ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static ArrayList<Integer> duplicates(int arr[], int n){
        // ArrayList<Integer> ans = new ArrayList<>();
        //     for(int i = 0; i < arr.length; i++){
        //         for(int j = i+1; j < arr.length; j++){
        //             if(arr[i] == arr[j]){
        //                 if(i == j || ans.contains(arr[i])){
        //                     continue;
        //                 }else{
        //                     ans.add(arr[i]);
        //                 }
        //             }
        //         }
        //     }
        //     if(ans.isEmpty()){
        //         ans.add(-1);
        //     }
        //     Collections.sort(ans);
        //     return ans;
    
        // ANOTHER APPROCH
        ArrayList<Integer> l =  new ArrayList<>();
       
        for(int i = 0;i<n ;i++){
         
         arr[arr[i]%n] +=n;
            
        }
        
        for(int i = 0;i<n ;i++){
         
         if( arr[i] / n >1 ){
             l.add(i);
         }
            
        }
       
        if(l.size() == 0){
            l.add(-1);
        }
        
        return l;
    }

}
