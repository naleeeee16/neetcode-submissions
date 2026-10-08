class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        
        for (int i =0 ; i < nums.length - 2 ; i++){
            if (nums[i]>0)break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = nums.length - 1;
            int k = i+1;
            while ( j > k ){
                int sum = nums[j]+ nums[k] +nums[i];
                if (sum==0){
                    res.add(Arrays.asList(nums[i], nums[k], nums[j]));
                    int currentLeft = nums[k];
                    int currentRight = nums[j];
                    while (k < j && nums[k] == currentLeft) k++;
                    while (k < j && nums[j] == currentRight) j--;               
                }else if (sum<0){
                    k++;
                }
                else{
                    j--;
                }

                
            }
        }
            return res;

    }
}
