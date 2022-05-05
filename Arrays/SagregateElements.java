package Arrays;

import java.util.*;

public class SagregateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        segregateElements(a, n);
        for(int i: a){
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        Queue<Integer> negetive = new LinkedList<>();
        Queue<Integer> positive = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                negetive.add(arr[i]);
            }else{
                positive.add(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(!positive.isEmpty()){
                arr[i] = positive.remove();
            }else if(!negetive.isEmpty()){
                arr[i] = negetive.remove();
            }
        }
    }
    
}
