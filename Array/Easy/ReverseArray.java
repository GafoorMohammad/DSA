class ReverseArray {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array before Rotation: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        for(int i=0;i<=n/2;i++){
            int temp = arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
        }
        System.out.print("Array before Rotation: ");
        for(int x: arr){
            System.out.print(x+" ");
        }
    }
    
}
