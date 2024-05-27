import java.util.Scanner;
class HelloWorld {
    public static int KadaneMaximumSumSubArray(int nums[],int n){
        int cur =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cur+=nums[i];
            max= Math.max(cur,max);
            if(cur<0){
                cur =0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(KadaneMaximumSumSubArray(arr,n));
    }
}
