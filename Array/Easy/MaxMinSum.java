 
class Solution
{ 
    public static int MaxMinSum(int A[], int N) 
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
