package Arrays;

import java.util.Scanner;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

public class b_MaxAndMinElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        pair p = getMinMax(a, n);
        System.out.println("min = " + p.first + ", max = " + p.second);
        sc.close();
    }
    public static pair getMinMax(long a[], long n)  
    {
        long max=a[0],min=a[0];
        for(int i=1;i<n;i++){
           if(a[i]>max)
           max=a[i];
           if(a[i]<min)
           min=a[i];
        }
        pair result=new pair(min,max);
        return result;
    }
}