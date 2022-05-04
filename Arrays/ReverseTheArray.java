package Arrays;

import java.util.*;
/**
 * ReverseTheArray
 */
public class ReverseTheArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i=0; i<T; i++){
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        for(int j=0; j<N; j++){
	            arr[j]=sc.nextInt();
	        }
	        for(int j=N-1; j>=0; j--){
	            System.out.print(arr[j]+" ");
	        }
	        System.out.println();
	    }
        sc.close();
    }
}