package Arrays;

import java.util.Scanner;

public class CyclicallyRotateAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        rotate(a, n);
        for(int i: a){
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i = n-1; i> 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    
}
