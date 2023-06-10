class triangle {
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=n-1;
        while(i>1){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
            else{
                i--;
            }
        }
        return 0;
    }
}
