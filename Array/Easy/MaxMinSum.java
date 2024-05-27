 import java.util.Scanner;
class MaxMinSum
{ 
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     int arr[] = new int[n];
     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }
     System.out.println(maxMinSum(arr,n));
    }
    public static int maxMinSum(int A[], int N) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
        }

        return max + min;
    }
}
