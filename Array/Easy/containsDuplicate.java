import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
class HelloWorld {
    public static boolean containsDuplicate(int nums[],int n){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(containsDuplicate(arr,n));
    }
}
