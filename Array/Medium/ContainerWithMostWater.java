class ContainerWithMostWater  {
    /*brute force
    public int maxArea(int[] arr) {
        int n = arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area = (j-i)*Math.min(arr[i],arr[j]);
                res = Math.max(res,area);
            }
        }
        
        return res;
    }
    */
    public int maxArea(int[] height) {
        int n = height.length;
        int left =0;
        int right = n-1;
        int res=0;
        while(left<right){
            int area = (right-left)*Math.min(height[left],height[right]);
            res = Math.max(area,res);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
}
