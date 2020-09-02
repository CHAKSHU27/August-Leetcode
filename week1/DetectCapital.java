class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=i+k&&j<nums.length;j++)
            {
                long x=(long)nums[i]-(long)nums[j];
                if(x<0)
                    x=-(x);
                if(x<=(long)t) return true;
            }
        }
        return false;
    }
}
