import java.util.Scanner;
import java.util.Arrays;

class ChocolateDistribution {
    public static int chocolateDistribution(int sizes[],int students){
        int minDiff=Integer.MAX_VALUE;
        if(sizes.length==0||students==0){
            return 0;
        }
        if(sizes.length<students){
            return -1;
        }
        Arrays.sort(sizes);
        for(int i=0;i+students-1<sizes.length;i++){
            int diff=sizes[i+students-1]-sizes[i];
            if(diff<minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int students = sc.nextInt();
        System.out.print(chocolateDistribution(arr,students));
    }
}
