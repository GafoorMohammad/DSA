import java.util.Scanner;
class SearchInRotatedSortedArray {
    public static boolean search(int arr[],int n,int x){
        int i;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                break;
            }
        }
        int l = (i+1)%n;
        int r = i;
        while(l!=r){
            if(arr[l]+arr[r]==x){
                return true;
            }
            if(arr[l]+arr[r]<x){
                l=(l+1)%n;
            }
            else{
                r = (n+r-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        boolean result = search(arr,n,x);
        if(result){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
