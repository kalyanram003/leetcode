class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minor=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return target;
                }

                if(Math.abs(sum-target)<Math.abs(minor-target)){
                    minor=sum;
                }
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return minor;
    }
}