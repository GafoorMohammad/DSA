class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
       int maxProduct = nums[0];
       int minProduct = nums[0];
       int result = nums[0];
       
       for(int i=1;i<nums.length;i++){
        int cur =nums[i];
        
        if(cur<0){
            int temp = maxProduct;
            maxProduct = minProduct;
            minProduct = temp;
        }
        maxProduct = Math.max(cur,maxProduct*cur);
        minProduct = Math.min(cur,minProduct*cur);
        result = Math.max(result,maxProduct);
       } 
       return result;
    }
}
